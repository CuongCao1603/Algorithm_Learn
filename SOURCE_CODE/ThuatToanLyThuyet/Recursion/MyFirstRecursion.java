package ThuatToanLyThuyet.Recursion;

public class MyFirstRecursion {

    // Tinh n!
    public static int GiaiThua(int n) {
//        Bai toan co so
        if (n == 0)
            return 1;

        // Cong thuc quy nap
        return n * GiaiThua(n - 1);
    }

//    Tìm số Fibonaci thứ n
    public static  int Fibo(int n ){
        // Bai toan co so
        System.out.println("Can tinh F[" + n + "] ");
        if(n <= 2){
            return 1;
        }
        // 2. Cong thuc quy nap
        int Fn = Fibo(n - 1) + Fibo(n - 2);
        return Fn;
    }


    public static void printElement(int[] arr, int index){
        // bai toan co so
        if(index < 0 || index >= arr.length){
            return;
        }
//        System.out.println(arr[arr.length]);
        printElement(arr, index + 1);
        System.out.println(arr[index]);
    }

    // de quy co nho
    static int[] F = new int[1000];
    public static int Fibo2(int n){
        if(F[n] != 0){
            return F[n];
        }
        System.out.println("Can tinh F[" + n + "] ");
        if(n <= 2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = Fibo2(n - 1) + Fibo2(n -2);
        return F[n];
    }

    public static void main(String[] args) {
//        System.out.println(GiaiThua(1));
//        System.out.println(GiaiThua(2));
//        System.out.println(GiaiThua(3));
//        System.out.println(GiaiThua(4));
//        System.out.println(GiaiThua(5));

//        System.out.println(Fibo(8));
//
//        int[] arr = {0,1,2,3,4,5,6,7,8};
//        printElement(arr, 0);
//        System.out.println(Fibo(7));

//        System.out.println(Fibo2(7));

//        F[10]

//        int[] Fibo = new int[11];
//
//        Fibo[1] = 1;
//        Fibo[2] = 1;
//        for (int i = 3; i <= 10; i++) {
//            Fibo[i] = Fibo[i -1] + Fibo[i + 2];
//        }
        System.out.println(Fibo2(7));
    }

}
