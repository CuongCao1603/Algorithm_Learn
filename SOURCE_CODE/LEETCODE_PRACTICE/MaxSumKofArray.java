package LEETCODE_PRACTICE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxSumKofArray {

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3,20,2,6,7,9,10,11};
        int k = 4;
        int sum = maxSumKofArray(arr, k);
        System.out.println("Sum " + sum);
    }

    private static int maxSumKofArray(int[] arr, int k) {

        int sum = 0;
        for (int j = 0; j < k; j++) {
            sum+= arr[j];

        }
        int max = sum;
        for (int i = 0; i < arr.length - k; i++) {

            System.out.println(sum);
            sum = sum - arr[i] + arr[i+k];

            if(max < sum) {
                max = sum;
            }
        }


        return max;
    }
}
