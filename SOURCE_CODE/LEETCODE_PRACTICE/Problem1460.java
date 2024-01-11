package LEETCODE_PRACTICE;

public class Problem1460 {
    public static boolean canBeEqual(int[] target, int[] arr) {

        boolean result = false;
        int sumTarget = 0;
        int sumArr = 0;
        int xorTargetArr = 0;
        for (int i = 0; i < target.length; i++) {
            sumArr += arr[i];
            sumTarget += target[i];
            xorTargetArr = xorTargetArr ^ arr[i] ^ target[i];
        }
        if(sumArr == sumTarget && xorTargetArr == 0){
            result = true;
            return result;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};

        boolean result = canBeEqual(target, arr);
        System.out.println("Rs: " + result);
    }
}
