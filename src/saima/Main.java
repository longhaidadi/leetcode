package saima;


import java.util.Scanner;

/**
 * Created by lon on 16-9-9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String str3 = scanner.nextLine();
            boolean forward = isOk(str1, str2, str3);
            boolean back = isOk(str1,reverse(str3),reverse(str2));
            if(!forward && !back){
                System.out.println("invalid");
            }else if(forward  && back){
                System.out.println("both");
            }else if(forward){
                System.out.println("forward");
            }else{
                System.out.println("backward");
            }
        }
    }
    static public boolean isOk(String str1,String str2,String str3){
        if(str1.isEmpty() || str2.isEmpty() || str3.isEmpty())return false;
        int index1 = str1.indexOf(str2);
        if(index1==-1)return false;
        int nextIndex = index1 + str2.length();
        if(nextIndex>str1.length()){
            return false;
        }
        return str1.indexOf(str3,nextIndex)==-1?false:true;
    }

    public static String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }


}
