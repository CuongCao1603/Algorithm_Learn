package LEETCODE_PRACTICE;

public class Problem1464 {

    public static int maxProduct(int[] nums) {

        int firstMax = 0;
        int secondMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > firstMax){
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return (firstMax -1) * (secondMax - 1);
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};

        System.out.println("Rs: " + maxProduct(nums));

//        System.out.println("100" + (-5));
    }
}
