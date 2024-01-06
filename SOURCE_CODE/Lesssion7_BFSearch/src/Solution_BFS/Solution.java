package Solution_BFS;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;

//  Definition for a binary tree node.
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

public class Solution {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<Double>();
        Queue<TreeNode> Q = new LinkedList<TreeNode>();
        Q.add(root);

        while (!Q.isEmpty()) {
            double qLen = Q.size();
            double sum = 0;
			for (int i = 0; i < qLen; i++) {
            TreeNode curr = Q.remove();
            TreeNode left = curr.left;
            TreeNode right = curr.right;

            sum += curr.val;
            if (left != null)
                Q.add(left);
            if (right != null)
                Q.add(right);
			}
            ans.add(sum / qLen);
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        // Input
//        System.setIn(new FileInputStream("sample_input.txt"));
        System.setIn(new FileInputStream("D:/FILE_CUA_CUONG/" +
                "THUAT_TOAN_FSOFT_FALL23/SOURCE_CODE/Lesssion7_BFSearch/src/Lession7_BFS/sample_input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TestCase = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= TestCase; test_case++) {
            int len = Integer.parseInt(br.readLine());
            int[] input = new int[len];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < len; i++) {
                input[i] = Integer.parseInt(st.nextToken());
            }

            // Solution
            TreeNode[] nodes = new TreeNode[len];
            for (int i = 0; i < len; i++) {
                if (input[i] != -1)
                    nodes[i] = new TreeNode(input[i]);
            }

            for (int i = 0; 2 * i + 2 < len; i++) {
                nodes[i].left = nodes[2 * i + 1];
                nodes[i].right = nodes[2 * i + 2];
            }

            List<Double> ans = averageOfLevels(nodes[0]);
            DecimalFormat df = new DecimalFormat("#.##");

            // Print
            System.out.print("#" + test_case + ": [");
            for (int i = 0; i < ans.size(); i++) {
                if (i < ans.size() - 1)
                    System.out.print(df.format(ans.get(i)) + ", ");
                else
                    System.out.print(df.format(ans.get(i)) + "]");
            }

            System.out.println();
        }
    }

}

