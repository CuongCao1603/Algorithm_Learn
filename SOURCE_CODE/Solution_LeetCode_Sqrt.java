public class Solution_LeetCode_Sqrt {
    public static void main(String[] args) {
        int n =8;
        int result = mySqrt(n);
        System.out.println(result);
    }
    private static int mySqrt(int n){
        int ret = -1;
        if(n ==0 | n==1)
            return n;
        int l = 1, r =n;
        while (l<=r){
            int m =l+(r-1)/2;
            if(m<n/m){
                l = m +1;
                ret =m;
            }
            if(m >n/m){
                r = m-1;
            }
            if(m==n/m){
                r = m-1;
            }
        }
        return ret;
    }
}
