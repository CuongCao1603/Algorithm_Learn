package Lession5_de_quy;

public class Finbonacci {


    public static void main(String[] args) {
        int n =5;
        System.out.println("Fibonacci series of " + n + " numbers is: ");
        for (int i = 0; i <n; i++) {
            System.out.println(fibonacciCal(i) + "");
        }

//        int value = fibonacciCal(n);


    }

    private static int fibonacciCal(int n) {
        while (fibonacciCal(n) >2){
            if(n == 0)
                return 0;


        }
        return 1;
    }

}
