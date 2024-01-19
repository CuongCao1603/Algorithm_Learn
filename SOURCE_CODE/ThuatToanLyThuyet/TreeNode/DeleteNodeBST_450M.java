package ThuatToanLyThuyet.TreeNode;


public class DeleteNodeBST_450M {
    private class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    // Tim node con trai cung cua root
    private TreeNode findLeftModeNode(TreeNode root){
        if(root == null)
            return null;
        TreeNode leftModeNode = root;
        while (leftModeNode.left!=null){
            leftModeNode = leftModeNode.left;
        }
        return leftModeNode;

    }

    // Xoa node key trong cay root
    // Return: Cay moi da duoc xoa node key
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        // B1: Di tim node xoa
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else { // root.value == key => xoa root | xac dinh duoc node xoa
            // B2: Xoa node root

            //Th1: Root la node la
            if (root.left == null || root.right == null) {
                return (root.left != null) ? root.left : root.right;
            }
            if (root.left == null && root.right == null) {
                return null;
            }
//            if (root.left == null && root.right != null) {
//                return root.right;
//            }

            // TH3 ton tai 2 con
            // Tim node trai cung cua cay con be
            TreeNode leftNodeMode = findLeftModeNode(root.right);
            root.val = leftNodeMode.val;
            root.right = deleteNode(root.right, leftNodeMode.val);

        }

        return root;
    }
}
