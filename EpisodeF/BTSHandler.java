package EpisodeF;

public class BTSHandler {
    public static void addToBST(TreeNode root, TreeNode node){ //1
        if (root.data < node.data && root.left == null) {
            root.left = node;
            return;
        }
        addToBST(root.left, node);
        if (root.data > node.data && root.right == null) {
            root.right = node;
            return;
        }
        addToBST(root.right, node);
    }

    public static int getMininumDataInBST(TreeNode root){ //3
        int minimum;
        if (root == null) {
            return -1;
        }
        if (root.left.data < root.data) {
            minimum = root.left.data;
        }
        return getMininumDataInBST(root.left);
    }

    public static int getMaxinumDataInBST (TreeNode root){
        int maximum;
        if (root == null) {
            return -1;
        }
        if (root.right.data > root.data) {
            maximum = root.right.data;
        }
        return getMaxinumDataInBST(root.right);
    }

    public static boolean isInBST(TreeNode root, int val){ //4
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        } else if (root.data > val) {
            return isInBST(root.left, val);
        }
        return isInBST(root.right, val);
    }

    public static boolean isBST(TreeNode root){//5
        if (root == null) {
            return false;
        }
        if (root.left.data > root.data || root.right.data < root.data) {
            return false;
        }
        return isBST(root.left) && isBST(root.right);
    }
}
