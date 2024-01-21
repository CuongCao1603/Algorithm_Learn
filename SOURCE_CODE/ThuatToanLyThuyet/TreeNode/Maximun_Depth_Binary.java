package ThuatToanLyThuyet.TreeNode;


import java.util.Map;

public class Maximun_Depth_Binary {
    /**
     * Definition for a binary tree node.
     * */
    private static class TreeNode {
        int val;
        TreeNode right;
       TreeNode left;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.right = right;
            this.left = left;

        }
    }
//    int count = 0;
    private static void printNodeDetails(TreeNode node, String position, int count) {
        System.out.println("------------- PRINT ROOT ----------");
        count++;
        if (node == null) {
            System.out.println(position + " null");
            return;
        }
        System.out.println(position + " Node value: " + node.val + " count " + count);
        printNodeDetails(node.left, position + " left", count);
        printNodeDetails(node.right, position + " right", count);
    }


    public static class Solution {
        // maxDepth(root) => Di tim chieu cao cua cay root
        public int maxDepth(TreeNode root, int countLeft, int countRight) {
            // B1: Dieu kien dung | bai toan co so
            if (root == null) {
                System.out.println("Reached a null node. Depth is 0.");
                return 0;
            }
            System.out.println("Print root " + root.val );


            // B2 Cong thuc de quy:
            // B2.1: Tinh chieu cao cua cay con ben trai
            System.out.println("Recursive call for left subtree: " + ((root.left != null) ? root.left.val : root.left)
                    + " count left: " + countLeft);

            countLeft++;
            int chieuCaoCayBenTrai = maxDepth(root.left,countLeft, countRight);
            System.out.println("Chieu cao trai: " + chieuCaoCayBenTrai + " count left: " + countLeft);

            // B2.2: Tinh chieu cao cua cay con ben phai
            System.out.println("Recursive call for right subtree:" +  ((root.right != null) ? root.right.val : root.right)
                    + " count right: " + countRight);
            countRight++;
            int chieuCaoCayBenPhai = maxDepth(root.right,countLeft, countRight);
            System.out.println("Chieu cao phai: " + chieuCaoCayBenPhai + " count right: " + countRight);

            // B2.3: Chon chieu cao lon nhat cua hai cay con va cong them 1 (cho cay hien tai)
            int result = Math.max(chieuCaoCayBenPhai, chieuCaoCayBenTrai) + 1;

            // B3: Tra ve ket qua chieu cao cua cay tai node hien tai
            System.out.println("At node with value " + root.val + ", depth is: " + result);


            System.out.println("------------------------------------------------");
            return result;
        }
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        // Create an instance of the Solution class
        Solution solution = new Solution();

        int count = 0;
        // Print details of each node in the tree
        printNodeDetails(root, "Root", count);
        // Call maxDepth with the tree and print the result
        int countLeft = 0, countRight = 0;
        int maxDepth = solution.maxDepth(root,countLeft, countRight);
        System.out.println("Maximum Depth of Binary Tree: " + maxDepth);
    }
}
