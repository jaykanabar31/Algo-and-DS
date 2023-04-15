package SlidingWindow;

import java.util.*;

public class MaxSum {

    public static void main(String[] args) {

        String s = "aababcabc";
        int uniqueStrings = 0;

        int i = 0;
        int j = (i + 3) - 1;

        char[] arrS = s.toCharArray();
        while(j < arrS.length && i <= (arrS.length - 3)){
            int k = i;
            int tempCount = 0;
            HashMap<Character, Integer> map = new HashMap<>();

            // inclusion in the window of 3
            while(k <= j){

                // moving to next window if the same character exits in the
                // window of size 3
                if(map.containsKey(Character.valueOf(arrS[k]))
                        && map.get(Character.valueOf(arrS[k])) >= i){
                    break;
                }
                // if the character doesn't exits
                else{
                    map.put(Character.valueOf(arrS[k]), k);
                    tempCount += 1;
                    k++;
                }
            }

            j++;
            i++;
            if(tempCount == 3)
                uniqueStrings += 1;
        }

        System.out.println(uniqueStrings);
    }
}
