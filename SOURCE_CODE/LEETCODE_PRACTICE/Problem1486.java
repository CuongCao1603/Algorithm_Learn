package LEETCODE_PRACTICE;

public class Problem1486 {
    public static int xorOperation(int n, int start) {
        int rs = start;
        for (int i = 1; i < n ; i++) {
            rs ^= start + 2 * i;
        }

        return rs;
//        for (int i = 0; i < nums.length ; i++) {
//            nums[i] += nums[i - 1];
//        }
//        return  nums;
    }
    

    public static void main(String[] args) {
        int n = 5,start= 0;
        
        int rs = xorOperation(n, start);
        System.out.println("Rs: " + rs);
        
    }
}
