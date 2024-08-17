package Gmar.Q14;

public class BinTree {
    public TreeNode root;

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        if (root.num % 2 == 0) {
            return 1 + countNodes(root.left) + countNodes(root.right);
        } else {
            return countNodes(root.left) + countNodes(root.right);
        }
    }

    public int evenNodes() {
        return countNodes(root);
    }

    public static void printAllInLevel(TreeNode root,int toLevel) {
        if (root == null) return;
        if (toLevel == 0) {
            System.out.println(root.num);
            return;
        }
        printAllInLevel(root.left,  toLevel - 1);
        printAllInLevel(root.right, toLevel - 1);
    }

    public void printToLevel(int toLevel) {
        if (root == null) return;
        printAllInLevel(root, toLevel);
    }
}
