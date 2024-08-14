package EpisodeF;

public class TreeHandler {
    public static String preOrderScan(TreeNode root) {//1
        if (root == null) {
            return "";
        }
        return root.data + " " + preOrderScan(root.left) + preOrderScan(root.right);
    }

    public static String inOrderScan(TreeNode root) {
        if (root == null) {
            return "";
        }

        if (root.left == null) {
            return String.valueOf(root.data) + " " + inOrderScan(root.right);
        }

        return inOrderScan(root.left) + root.data + " " + inOrderScan(root.right);
    }

    public static String postOrderScan(TreeNode root) {
        if (root == null) {
            return "";
        }
        if (root.left == null) {
            return postOrderScan(root.right) + " " + String.valueOf(root.data);
        }
        return postOrderScan(root.left) + postOrderScan(root.right) +
                " " + String.valueOf(root.data);
    }

    public static int countNodes(TreeNode root) {//2
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static int sumEvenNodes(TreeNode root) {//3
        if (root == null) {
            return 0;
        }
        if (root.data % 2 == 0) {
            return root.data + sumEvenNodes(root.left) + sumEvenNodes(root.right);
        }
        return sumEvenNodes(root.left) + sumEvenNodes(root.right);
    }

    public static int countLeaves(TreeNode root) {//4
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
    }
    public static int countHavingBigBoys(TreeNode root) {//5
        if (root == null) {
            return 0;
        }
        int counter = countHavingBigBoys(root.left) + countHavingBigBoys(root.right);
        if (root.right != null && root.data < root.right.data || root.left != null && root.data < root.left.data) {
            return 1 + counter;
        }
        return counter;
    }
    public static int getLevel(TreeNode root) {//6
        if (root == null) {
            return -1;
        }
        int getLeft = getLevel(root.left);
        int getRight = getLevel(root.right);
        return Math.max(getLeft, getRight) + 1;
    }
    public static void printAllInLevel(TreeNode root, int levelDistance) {//7
        if (root == null) {
            return;
        }
        if (levelDistance == 0) {
            System.out.println(root.data);
            return;
        }
        printAllInLevel(root.left, levelDistance - 1);
        printAllInLevel(root.right, levelDistance - 1);
    }
    public static boolean isInTree(TreeNode root, int val){//8
        if (root == null) {
            return false;
        } else if (root.data == val) {
            return true;
        }
        return isInTree(root.left, val) || isInTree(root.right, val);
    }

    public static TreeNode getInTree(TreeNode root, int val){//9
        if (root == null) {
            return null;
        }
        if (root.data == val) {
            return root;
        }

        TreeNode left = getInTree(root.left, val);

        if (left != null) {
            return left;
        }

        return getInTree(root.right, val);
    }
}
