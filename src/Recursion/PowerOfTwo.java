package Recursion;

public class PowerOfTwo {

    public static void main(String[] args) {

        PowerOfTwo pw = new PowerOfTwo();

        System.out.println(pw.solvRec(new Double(16777217)));

    }

    public boolean solvRec(double n){
        if(n == 1)
            return true;

        if(n < 1)
            return false;

        boolean isPow = solvRec(n / 2);

        return isPow;
    }
}
