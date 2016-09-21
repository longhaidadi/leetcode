package ict;

/**
 * Created by lon on 16-8-27.
 */
public class Solution13 {
    public int ramonToInt(String s){
        char [] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i <c.length ; i++) {
            int val = getSymbolValue(c[i]);
            if((i+1)<c.length && val< getSymbolValue(c[i+1]))
                sum -= val;
            else sum += val;
        }
        return sum ;
    }
    public int getSymbolValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }
}
