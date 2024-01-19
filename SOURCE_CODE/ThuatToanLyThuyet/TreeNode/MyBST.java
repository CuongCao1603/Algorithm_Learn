package ThuatToanLyThuyet.TreeNode;

public class MyBST {
    public TreeNode mRoot;

    public MyBST() {
    }

//    Su dung de quy - Recursion

    public TreeNode insertIntoBST(TreeNode rootNode, int value){
        if(rootNode == null){
            return new TreeNode(value);
        }
        if(value < rootNode.val){
            if(rootNode.left == null){
                rootNode.left = new TreeNode(value);
            } else{
                insertIntoBST(rootNode.left, value);
            }
        } else {
            if(rootNode.right == null){
                rootNode.right = new TreeNode(value);
            } else{
                insertIntoBST(rootNode.right, value);
            }
        }
        return rootNode;
    }

    public TreeNode searchBST(TreeNode root, int key){
        if(root == null)
            return null;

        if(key< root.val){
            return searchBST(root.left, key);
        }else if(key > root.val){
            return searchBST(root.right, key);
        } else {
            return root;
        }
    }

    // Node - L - R
    public void preOrder(TreeNode currNode){
        if(currNode == null){
            return;
        }
        // duyet curr truoc
        System.out.print(currNode.val+" ");
        preOrder(currNode.left);
        preOrder(currNode.right);
    }


//    public TreeNode insert(TreeNode root, int value) {
//        TreeNode newNode = new TreeNode(value);
////        TH1: root == null
//        if (root == null) {
//            root = new TreeNode(value);
//            return root;
//        } else {
//            TreeNode temp = root;
//            while (true) {
//                if (value > temp.val) {
//                    if (temp.right == null) {
//                        temp.right = newNode;
//                        break;
//                    } else {
//                        temp = temp.right;
//                    }
//                } else {
//                    if (temp.left == null) {
//                        temp.left = newNode;
//                        break;
//                    } else {
//                        temp = temp.left;
//                    }
//                }
//            }
//            return root;
//        }
//    }



}
