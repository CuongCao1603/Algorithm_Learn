//package Lesssion7_BFSearch_4_1_24.src.Practice_BFS;
//
//import java.io.*;
//import java.util.List;
//import java.util.StringTokenizer;
//
//class TreeNode {
//    int val;
//    int idx;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    public TreeNode(int val, int idx) {
//        this.val = val;
//        this.idx = idx;
//    }
//
//    public TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//public class Solution_Draft {
//    private static BufferedReader br;
//    private static StringTokenizer st;
//    private static TreeNode[] trees;
//
//
//    static Boolean hasPathSum(TreeNode root, int targetSum) {
//        return false;
//    }
//
//    public static void main(String[] args) throws IOException {
//        System.setIn(new FileInputStream("D:/FILE_CUA_CUONG/" +
//                "THUAT_TOAN_FSOFT_FALL23/SOURCE_CODE/Lesssion7_BFSearch_4_1_24/src/Practice_BFS/" +
//                "input.txt"));
//        br = new BufferedReader(new InputStreamReader(System.in));
//
//        int TestCase = Integer.parseInt(br.readLine());
//
//        for (int test_case = 1; test_case <= TestCase-10; test_case++) {
//            String line = br.readLine();
//            StringTokenizer tokenizer = new StringTokenizer(line, " ");
//            int len = Integer.parseInt(tokenizer.nextToken()); // Lấy giá trị 13
//            int targetSum = Integer.parseInt(tokenizer.nextToken()); // Lấy giá trị 22
//            System.out.println("TARGET_SUM "+test_case+ ": " + targetSum);
//
//            int[] input = new int[len];
////            System.out.println("TARGET_SUM: " + targetSum);
//            st = new StringTokenizer(br.readLine(), " ");
//            for (int i = 0; i < len; i++) {
//                input[i] = Integer.parseInt(st.nextToken());
//            }
//
//            // Solution
//            trees = new TreeNode[len];
//            for (int i = 0; i < len; i++) {
//                if (input[i] != -1)
//                    trees[i] = new TreeNode(input[i]);
//            }
//
//            for (int i = 0; 2 * i + 2 < len; i++) {
//                trees[i].left = trees[2 * i + 1];
//                trees[i].right = trees[2 * i + 2];
//            }
////            for (int i = 0; i < trees.length; i++) {
////                System.out.println("Value tree: ");
////                System.out.print(trees[i] + " ");
////            }
////            System.out.println("Tree list: " + trees.toString());
//            boolean ans = hasPathSum(trees[0], targetSum);
//        }
//
//    }
//}



package Lesssion7_BFSearch_4_1_24.src.Practice_BFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
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

    static Boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // Kiểm tra nếu node là lá và giá trị của nó bằng với targetSum
            if (node.left == null && node.right == null && node.val == targetSum) {
                return true;
            }

            // Thêm node con vào hàng đợi nếu tồn tại
            if (node.left != null) {
                node.left.val += node.val; // Cộng giá trị của nút con với giá trị của nút cha
                queue.offer(node.left);
            }
            if (node.right != null) {
                node.right.val += node.val; // Cộng giá trị của nút con với giá trị của nút cha
                queue.offer(node.right);
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("D:/FILE_CUA_CUONG/" +
                "THUAT_TOAN_FSOFT_FALL23/SOURCE_CODE/Lesssion7_BFSearch_4_1_24/src/Practice_BFS/" +
                "input.txt"));
        br = new BufferedReader(new InputStreamReader(System.in));

        int TestCase = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= TestCase; test_case++) {
            String line = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line, " ");
            int len = Integer.parseInt(tokenizer.nextToken());
            int targetSum = Integer.parseInt(tokenizer.nextToken());

            int[] input = new int[len];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < len; i++) {
                input[i] = Integer.parseInt(st.nextToken());
            }

            trees = new TreeNode[len];
            for (int i = 0; i < len; i++) {
                if (input[i] != -1)
                    trees[i] = new TreeNode(input[i]);
            }

            for (int i = 0; 2 * i + 2 < len; i++) {
                trees[i].left = trees[2 * i + 1];
                trees[i].right = trees[2 * i + 2];
            }

            boolean ans = hasPathSum(trees[0], targetSum);
            System.out.println("Test case " + test_case + ": " + ans);
        }
    }
}
