package LEETCODE_PRACTICE;

public class MinPathBottle {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 7;

        int d = 6;

        int step = MinStepToFullBottleD(a, b, c, d);
    }

    private static int MinStepToFullBottleD(int a, int b, int c, int d) {
        int init;
        int max = 0, mid = 0, min = 0;
        if (a < b && a < c) {
            min = a;
        }
        if (b < a && b < c) {
            min = b;
        }
        if (c < b && c < a) {
            min = c;
        }

        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > b && c > a) {
            max = c;
        }

        if (a < max && a > min) {
            mid = a;
        }
        if (b < max && b > min) {
            mid = b;
        }
        if (c < max && c > min) {
            mid = c;
        }

        System.out.println("Test val: max " + max + " min " + min + " mid " + mid);

        int minTimes = 0;
        // in case max bottle
        init = max;
        while(!(a==d || b==d || c==d)){

        }

        // in case middle bottle
        init = mid;
        while(!(a==d || b==d || c==d)){

        }

        return 0;
    }

    public static void fill(int m, int n, int p, int x) {
        // x lit from m to n

        m = m - x;
        n = n + x;

    }
}
