package ThuatToanLyThuyet.TreeNode;

public class MyBST {
    private TreeNode mRoot;

    public MyBST() {
    }

    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
//        TH1: root == null
        if (root == null) {
            root = new TreeNode(value);
            return root;
        } else {
            TreeNode temp = root;
            while (true){
                if(value > temp.val){
                   if(temp.right == null){
                       temp.right = newNode;
                   } else{
                       temp = temp.right;
                   }
                } else {
                    temp = temp.left;
                }
            }
        }
    }

}
