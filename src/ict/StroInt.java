package ict;

/**
 * Created by lon on 16-3-6.
 */
public class StroInt {
    public static int ToInt (char[] str){
        int ret = 0;
        if(str==null )
            return 0;
        int i =0;
        int len = str.length;
        while (i<len && str[i]==' ')i++;
        int sign = 1;
        if(str[i]=='+' || str[i]=='-'){
            if(str[i]=='-')
                sign=-1;
            i++;
        }
        for(int j =i;j<len;j++){
            if(isDig(str[j]))break;
            int c = str[j]-'0';
            if(sign>0 &&(ret>Integer.MAX_VALUE/10 || (ret==Integer.MAX_VALUE/10&&c>Integer.MAX_VALUE%10 ))){
                return Integer.MAX_VALUE;
            }else if( sign<0 &&(ret<Integer.MIN_VALUE/10 || (ret==Integer.MIN_VALUE/10&&c<Integer.MIN_VALUE%10))){
                return Integer.MIN_VALUE;
            }
            ret = ret*10+c;
        }
        return sign>0?ret:-ret;
    }

    public static boolean isDig(char num){
        return num>='0' && num<='9';
    }
}
