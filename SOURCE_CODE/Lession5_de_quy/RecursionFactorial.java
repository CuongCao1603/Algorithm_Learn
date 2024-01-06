package Lession5_de_quy;

public class RecursionFactorial {
    public static long giaiThua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * giaiThua(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        long result = giaiThua(number);
        System.out.println("Giai thừa của " + number + " là: " + result);
    }
}
