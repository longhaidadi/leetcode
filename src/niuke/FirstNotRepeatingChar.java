package niuke;

import java.util.Arrays;

/**
 * Created by lon on 16-5-30.
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if(str==null || str.length()==0) return -1;
        boolean [] array = new boolean[256];
        Arrays.fill(array, false);

        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(!array[c])
                array[c]=true;
            else return i;
        }

        return -1;
    }
}
