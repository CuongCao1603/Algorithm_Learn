package Lesssion7_BFSearch_4_1_24.src.Lession7_BFS;

import java.io.*;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class averageBinaryTreeSolution {


    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<Double>();
        Queue<TreeNode> Q = new LinkedList<TreeNode>();
        Q.add(root);

        while (!Q.isEmpty()) {
            double qLen = Q.size();
            int sum = 0;
            for (int i = 0; i < qLen; i++) {
                TreeNode curr = Q.remove();
                TreeNode left = curr.left;
                TreeNode right = curr.right;

                sum += curr.val;
                if (left != null) Q.add(left);
                if (right != null) Q.add(right);
            }
            ans.add(sum / qLen);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("D:/FILE_CUA_CUONG/" +
                "THUAT_TOAN_FSOFT_FALL23/SOURCE_CODE/Lesssion7_BFSearch/src/Lession7_BFS/sample_input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TestCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < TestCase; i++) {
            int len = Integer.parseInt(br.readLine());
            int[] input = new int[len];

//            đọc từng hàng rồi lấy ra từng phần tử
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < len; j++) {
                input[j] = Integer.parseInt(st.nextToken());
            }

            // Solution
            TreeNode[] nodes = new TreeNode[len];
            for (int j = 0; j < len; j++) {
                if (input[i] != -1)
                    nodes[i] = new TreeNode(input[i]);
            }
            for (int j = 0; 2 * j + 2 < len; j++) {
                nodes[i].left = nodes[2 * i + 1];
                nodes[i].right = nodes[2 * i + 2];
            }
            List<Double> ans = averageOfLevels(nodes[0]);


//            Print
            System.out.println("#" + i + ": [");
            for (int j = 0; j < ans.size(); j++) {
                if (i < ans.size() - 1)
                    System.out.println(input[i] + ", ");
                else
                    System.out.println(input[i] + "]");
            }
            System.out.println();
        }


    }
}
