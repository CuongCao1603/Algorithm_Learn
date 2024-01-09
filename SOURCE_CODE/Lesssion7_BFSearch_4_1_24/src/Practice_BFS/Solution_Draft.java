package Practice_BFS;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

class TreeNode{
    int val;
    int idx;
    TreeNode left;
    TreeNode right;

    TreeNode(){

    }
    TreeNode(int val){this.val = val;}

    public TreeNode(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution_Draft {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static TreeNode[] trees;
    
    
    static Boolean hasPathSum(TreeNode root, int targetSum){
        return false;
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("D:/FILE_CUA_CUONG/" +
                "THUAT_TOAN_FSOFT_FALL23/SOURCE_CODE/Lesssion7_BFSearch/src/Practice_BFS/" +
                "input.txt"));
         br = new BufferedReader(new InputStreamReader(System.in));

        int TestCase = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < TestCase; test_case++) {
            int len = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(" ");
            int targetSum = Integer.parseInt(st.nextToken());

            System.out.println("TargetSum: " + targetSum);
//            int[] input = new int[len];
//             st = new StringTokenizer(br.readLine(), " ");
//            for (int i = 0; i < len; i++) {
//                input[i] = Integer.parseInt(st.nextToken());
//            }
//
//            // Solution
//             trees = new TreeNode[len];
//            for (int i = 0; i < len; i++) {
//                if(input[i]!= -1)
//                    trees[i] = new TreeNode(input[i]);
//            }
//
//            for (int i = 0; 2*i+2 < len ; i++) {
//                trees[i].left = trees[2 * i + 1];
//                trees[i].right = trees[2 * i + 2];
//            }
//
//            int targetSum;
//            boolean ans = hasPathSum(trees[0], targetSum);
        }

    }
}
