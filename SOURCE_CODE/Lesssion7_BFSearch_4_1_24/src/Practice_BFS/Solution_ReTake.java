package Lesssion7_BFSearch_4_1_24.src.Practice_BFS;

import java.io.*;
import java.util.StringTokenizer;

class TreeNodeRetake{
    int val;
    int idx;

    TreeNodeRetake left;
    TreeNodeRetake right;

    public TreeNodeRetake() {
    }

//    public TreeNodeRetake(int val) {
//        this.val = val;
//    }
    public TreeNodeRetake(int idx) {
        this.idx = idx;
    }
    public TreeNodeRetake(int val, int idx, TreeNodeRetake left, TreeNodeRetake right) {
        this.val = val;
        this.idx = idx;
        this.left = left;
        this.right = right;
    }
}
public class Solution_ReTake {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static TreeNodeRetake[] trees;
    private static int len;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("D:/FILE_CUA_CUONG/" +
                "THUAT_TOAN_FSOFT_FALL23/SOURCE_CODE/Lesssion7_BFSearch_4_1_24/src/Practice_BFS/" +
                "input.txt"));
        br = new BufferedReader(new InputStreamReader(System.in));

        int TestCase = Integer.parseInt(br.readLine());

        for (int i = 1; i < TestCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int len = Integer.parseInt(st.nextToken());
            int targetSum = Integer.parseInt(st.nextToken());

            int[] input = new int[len];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < len; j++) {
                input[j] = Integer.parseInt(st.nextToken());
            }
            trees = new TreeNodeRetake[len];
            for (int j = 0; j < len; j++) {
                if(input[j] != -1){
                    trees[j] = new TreeNodeRetake(input[j]);
                }
            }

            for (int j = 0; 2 * j + 2 < len; j++) {
                trees[j].left = trees[2 * j + 1];
                trees[j].right = trees[2 + j + 2];
            }

            boolean ans = hasPathSumRetake(trees[0], targetSum);
            System.out.println("Test case " + i + ": " + ans);
        }

    }

    static boolean hasPathSumRetake(TreeNodeRetake tree, int targetSum) {
        int[] sum = new int[len];


        return false;
    }
}
