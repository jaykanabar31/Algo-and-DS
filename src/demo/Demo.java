package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Demo {

    public static void main(String[] args){

        int num = 110;

        HashMap<Integer, String> table = new HashMap();
        table.put(1, "I");
        table.put(5, "V");
        table.put(10, "X");
        table.put(50, "L");
        table.put(100, "C");
        table.put(500, "D");
        table.put(1000, "M");
        table.put(0, "");

        //Sub cases
        table.put(4, "IV");
        table.put(9, "IX");
        table.put(40, "XL");
        table.put(90, "XC");
        table.put(400, "CD");
        table.put(900, "CM");

        //extra sub cases
        table.put(2, "II");
        table.put(3, "III");
        table.put(6, "VI");
        table.put(7, "VII");
        table.put(8, "VIII");

        table.put(20, "XX");
        table.put(30, "XXX");
        table.put(60, "LX");
        table.put(70, "LXX");
        table.put(80, "LXXX");

        table.put(200, "CC");
        table.put(300, "CCC");
        table.put(600, "DC");
        table.put(700, "DCC");
        table.put(800, "DCCC");

        table.put(2000, "MM");
        table.put(3000, "MMM");

        int numLength = String.valueOf(num).length();

        String answer = "";

            switch(numLength){
                case 4:
                    answer = getValues(num, numLength, table, answer);
                    break;
                case 3:
                    answer = getValues(num, numLength, table, answer);
                    break;
                case 2:
                    answer = getValues(num, numLength, table, answer);
                    break;
                case 1:
                    answer = getValues(num, numLength, table, answer);
                    break;
            }

        System.out.println(answer);
    }

    private static String getValues(int num, int numLength, HashMap<Integer, String> table, String answer){



        return null;
    }

    private static String  mapToRoman(int rem, HashMap<Integer, String> table, String answer){
        String temp = table.get(rem);
        answer = temp.concat(answer);

        return answer;
    }
}
