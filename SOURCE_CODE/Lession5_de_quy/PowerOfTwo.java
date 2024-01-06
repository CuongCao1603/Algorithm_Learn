package Lession5_de_quy;

public class PowerOfTwo {

    public static void main(String[] args) {
        int n = 14;

        powerOfTwo(n);
        System.out.println(powerOfTwo(n));
    }

    private static boolean powerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }


        return n % 2 == 0 && powerOfTwo(n / 2);
    }
}
