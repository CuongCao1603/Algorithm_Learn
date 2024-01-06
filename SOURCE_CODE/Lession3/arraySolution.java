package Lession3;

import java.util.Scanner;

public class arraySolution {
    static final int MAX = 100;
    static final int MIN = -100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);

    }

    private static void xuatMang(int[][] arr, int row, int col) {
        // TODO Auto-generated method stub
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] taoMang(int row, int col) {
        int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = (int) (Math.random() * (MAX - MIN) + 1) + MIN;
            }
        }
        return a;
    }

    private static int nhapN(Scanner sc) {
        int n;
        do {
            System.out.print("Nhập vào giá trị > 1: ");
            n = Integer.parseInt(sc.nextLine());
            System.out.println();
        } while (n < 1);

        return n;
    }
}
