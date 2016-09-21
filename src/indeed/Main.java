package indeed;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lon on 16-6-4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        run(str);
    }
    public static void run(String str){
        int len = str.length();
        if(len==1){
            for(int i =0;i<4;i++){
                System.out.println((char)('a'+i));
            }
        }
        else {
            if (len == 2) {
                int a = (1<<(str.charAt(0)-'a'))|(1<<(str.charAt(1)-'a'));
                int b ;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                       b = (1<<i) | (1<<j);
                       if((a&b)!=0){
                           System.out.println((char)(i+'a')+""+(char)(j+'a'));
                       }
                    }
                }
            } else if (len == 3) {
                int a = (1<<(str.charAt(0)-'a'))|(1<<(str.charAt(1)-'a'))|(1<<(str.charAt(2)-'a'));
                int b ;

                int dlen = getDistinctNum(str);
                if(dlen==1){
                    getOne(str);
                    return;
                }
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        for (int k = 0; k < 4; k++) {
                            b = (1<<i) | (1<<j)|(1<<k);
                            int n = (a&b);
                            if(dlen==2){
                                if((n&(n-1))==0|| n==1)
                                    System.out.println((char) (i + 'a') + "" + (char) (j + 'a') + (char) (k + 'a'));
                            }else if((n&(n-1))!=0  ) {
                                    System.out.println((char) (i + 'a') + "" + (char) (j + 'a') + (char) (k + 'a'));
                            }
                        }
                    }
                }
            }
        }
    }

    private static int getDistinctNum(String str){
        int count = 0;
        boolean [] array = new boolean[4];
        Arrays.fill(array,false);
        for (int i = 0; i <str.length() ; i++) {
            array[str.charAt(i)-'a']=true;
        }
        for (int i = 0; i < str.length(); i++) {
            if(array[i]==true)count++;
        }
        return count;
    }

    private static void getOne(String str){
        char [] array = str.toCharArray();
        boolean isOk = false;
        System.out.println(str);
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 4; j++) {
                char t = array[i];
                array[i]=(char)('a'+j);
                String v = String.valueOf(array);
                if(v.equals(str)){
                    if(isOk)
                    isOk=true;
                    else continue;
                }
                System.out.println(v);
                array[i]=t;
            }
        }
    }





}

