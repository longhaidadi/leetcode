#include "stdio.h"
#include "stdlib.h"
#include "sys/types.h"
#include "sys/stat.h"
#include "fcntl.h"
#include "sys/ioctl.h"
#include "string.h"
#include "errno.h"
#include "unistd.h"
#include "test_TestZtt.h"



#define MAX_FILTERS     10

#define LEOFS_ERR_REP_ONLY          (1495) /*非副本存储模式*/
#define LEOFS_ERR_NOT_FILEDIR       (1496) /*既不是普通文件也不是目录*/
#define LEOFS_ERR_AFFINITY_NOTSET   (1497) /*查询的对象没有设置亲和性*/

struct __ioctl_get_istinfo {
	int istnum;
	int pad;
	int istid[16];
	char  ips[16][4][16];
};
typedef struct __ioctl_get_istinfo ioctl_get_istinfo_t;

#define LEOFS_IOC_SET_ALLOC_AFFINITY     _IO('l', 157)
#define LEOFS_IOC_CANCEL_ALLOC_AFFINITY  _IO('l', 158)
#define LEOFS_IOC_GET_ISTID              _IOR('l', 159, ioctl_get_istinfo_t)
#define LEOFS_IOC_CHECK_ALLOC_AFFINITY   _IO('l', 160)

JNIEXPORT jint JNICALL Java_test_TestZtt_setValue
     (JNIEnv *env, jobject jobj, jstring path){

	const char *pathPointer = (*env)->GetStringUTFChars(env, path, 0);
	int fd = -1;
	fd = open(pathPointer, O_RDONLY);
	if (fd < 0) {
		printf("Open path: %s failed,  errno: %d\n", pathPointer, errno);
		close(fd);
		return errno;
	}
	int err = ioctl(fd, LEOFS_IOC_SET_ALLOC_AFFINITY);
	if (err < 0) {
		if (errno == LEOFS_ERR_NOT_FILEDIR) {
			printf("Path %s not regular file or directory!\n", pathPointer);
		} else if (errno == LEOFS_ERR_REP_ONLY) {
			printf("Path %s not in rep layout!\n", pathPointer);
		} else {
			printf("Operation %s failed, errno: %d\n",pathPointer, errno);
		}
		close(fd);
		return errno;
	}
	printf("Operation finished!\n");
	close(fd);
	return 0;
}

JNIEXPORT jstring JNICALL Java_test_TestZtt_getValue
    (JNIEnv *env, jobject jobj, jstring path, jint offset){
	char buf[4096];
	
	memset(buf, 0, sizeof(buf));
	jstring content;

	const char *pathPointer = (*env)->GetStringUTFChars(env, path, 0);
	
	sprintf(buf, "#pathPointer: %s, %p", pathPointer,pathPointer);
	printf("1%s,%p\n",pathPointer,pathPointer);
	/*
    content = (*env)->NewStringUTF(env, buf);
	return content;
	*/		
	struct stat st;
	ioctl_get_istinfo_t  *igid;
	igid = malloc(sizeof(ioctl_get_istinfo_t));
	//memset(&igid, 0, sizeof(ioctl_get_istinfo_t));
	
	 printf("2%s,%p\n",pathPointer,pathPointer);

	int fd = open(pathPointer, O_RDONLY);
	 printf("3%s,%p\n",pathPointer,pathPointer);

    if (fd < 0) {
		sprintf(buf, "%s,  #Open path: %s , %p failed,  errno: %d\n", buf,pathPointer, pathPointer, errno);
        content = (*env)->NewStringUTF(env, buf);
        close(fd);
		return content;
	}
	memset(&st, 0, sizeof(st));
	int err = fstat(fd, &st);
	if (err < 0) {
		sprintf(buf, "#Stat %s failed, errno: %d\n", pathPointer, errno);
        content = (*env)->NewStringUTF(env, buf);
        close(fd);
		return content;
	}
	if ((offset > 0) && S_ISREG(st.st_mode)) {
		lseek(fd, offset, SEEK_SET);
	}
	err = ioctl(fd, LEOFS_IOC_GET_ISTID, &igid);
	if (err < 0) {
		if (errno == EPERM) {
			sprintf(buf, "#Operation not permitted! errno: %d\n", errno);

		} else if (errno == LEOFS_ERR_NOT_FILEDIR) {
			sprintf(buf, "#Path %s is not regular file or directory!, errno: %d\n", pathPointer, errno);
		} else {
			if (S_ISDIR(st.st_mode) && errno == LEOFS_ERR_AFFINITY_NOTSET) {
				sprintf(buf, "#Directory: %s is not set alloc affinity!, errno: %d\n", pathPointer, errno);
			} else {
				sprintf(buf, "#Operation failed, errno: %d\n", errno);
			}
		}
		content = (*env)->NewStringUTF(env, buf);
		close(fd);
		return content;
	}

	if (S_ISREG(st.st_mode)) {
		printf("File: %s , offset: %d, istid number: %d\n", pathPointer, offset, igid->istnum);
	} else {
		printf("Directory: %s , istid number: %d\n", pathPointer, igid->istnum);
	}
	close(fd);

	
/*  测试的时候将结点ip写死	
	sprintf(buf, "%d", igid->istnum);
	sprintf(buf, "%s|%d", buf, igid->pad);
	int i, j;
	for(i = 0; i< igid->istnum; i ++) {
    	if(i == 0)
            sprintf(buf, "%s|%d", buf,igid->istid[i]);
        else
            sprintf(buf, "%s,%d", buf,igid->istid[i]);
    }
    for(i = 0; i< igid->istnum; i ++) {
    	for(j = 0; j < sizeof(igid->ips[i]); j ++) {
    		if(i == 0 && j == 0)
    			sprintf(buf, "%s|%s", buf,igid->ips[i][j]);
    		else
    			sprintf(buf, "%s,%s", buf,igid->ips[i][j]);
    	}
    	if(i != igid->istnum - 1)
    		sprintf(buf, "%s/", buf);
    }
*/
	sprintf(buf, "%s", "1|0|5|127.0.1.1/10.61.3.26/202.106.199.36");
	content = (*env)->NewStringUTF(env, buf);
	free(igid);
	return content;

}


