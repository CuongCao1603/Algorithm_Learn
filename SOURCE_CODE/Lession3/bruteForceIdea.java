package Lession3;

public class bruteForceIdea {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";


        if(bruteForce(haystack, needle) !=1){
            System.out.println(bruteForce(haystack, needle) !=1);
        } else{
            System.out.println("-1");
        }
    }

    private static int bruteForce(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for ( j = 0; j < m; j++) {
                if (haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if(j == m)
            return i;
        }
       return -1;

    }
}
