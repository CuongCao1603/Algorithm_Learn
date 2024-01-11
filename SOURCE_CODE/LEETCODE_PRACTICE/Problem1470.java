package LEETCODE_PRACTICE;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < n; i++) {
            newNums[i * 2] = nums[i];
            newNums[i * 2 + 1] = nums[i + n];
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        nums = shuffle(nums, n);

        System.out.println("Rs: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
