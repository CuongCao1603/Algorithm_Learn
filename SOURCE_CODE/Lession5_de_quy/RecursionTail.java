package Lession5_de_quy;

public class RecursionTail {
    public static void main(String[] args) {
        int n = 5;

        int result = sum2(n, 0);
        System.out.println(result);
    }

    private static int sum2(int n, int total) {

        if (n == 0)
            return total;
            return sum2(n - 1, total + n);

    }

    private static int sum(int n) {
        if (n == 0)
            return 0;
            return n + sum(n - 1);

    }
}
