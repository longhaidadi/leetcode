package niuke;

/**
 * Created by lon on 16-6-2.
 */
public class StrToInt {
    public int StrToInt(String str) {
        if(str==null|| str.equals(""))return 0;
        int ret = 0;
        boolean isPositive = true;
        char [] array = str.toCharArray();
        int pos = 0;
        while (array[pos]==' ')pos++;
        if(array[pos]=='+' || array[pos]=='-'){
            if(array[pos]=='-')
                isPositive=false;
            pos++;
        }
        for(int i =pos;i<array.length;i++){
            int c = array[i]-'0';
            if(c<0 || c>9) return 0;
            if(isPositive){
                if((ret>Integer.MAX_VALUE/10)||(ret==Integer.MAX_VALUE/10)&&c>Integer.MAX_VALUE%10)
                    return Integer.MAX_VALUE;
            }else {
                if((ret<Integer.MIN_VALUE/10)||(ret==Integer.MIN_VALUE/10)&&c>Integer.MIN_VALUE%10)
                    return Integer.MIN_VALUE;

            }
            ret = ret*10+c;
        }
        return isPositive?ret:(-ret);
    }
}
