package LEETCODE_PRACTICE;

public class MaxConsecutiveOnes_485 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,1,};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    private static int findMaxConsecutiveOnes(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count = 0;
            } else{
                count++;
                max = (count > max) ? count : max;
            }
        }
        return max;
    }
}
