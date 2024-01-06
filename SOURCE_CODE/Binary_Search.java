public class Binary_Search {
    public static void main(String[] args) {
        int x = 0;
        int arr[] = {0, 10, 20, 30, 40, 50, 112, 114, 2112, 3114};
        x = 20;

        int result = binarySearch2(arr, x);
        System.out.println("Result: " + result);

    }

    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static int binarySearch2(int[] arr, int x) {
        int l = 0, n = arr.length, r = n - 1;

        while (l <= r) {
            int m = (r + l) / 2;
            if (x > arr[m])
                l = m + 1;
            if (x < arr[m])
                r = m - 1;
            if(x == arr[m])
                return m;
        }
        return -1;
    }


}
