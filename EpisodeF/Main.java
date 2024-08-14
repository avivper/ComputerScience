package EpisodeF;

import com.sun.source.tree.Tree;

import java.io.PrintStream;

public class Main extends TreeHandler {
    public static void main(String[] args) {

        TreeNode q = new TreeNode(7);
        BTSHandler b = new BTSHandler();

        b.addToBST(q, new TreeNode(4));
        b.addToBST(q, new TreeNode(8));
        b.addToBST(q, new TreeNode(2));
        b.addToBST(q, new TreeNode(15));
        b.addToBST(q, new TreeNode(20));
        b.addToBST(q, new TreeNode(10));
        b.addToBST(q, new TreeNode(5));
        b.addToBST(q, new TreeNode(3));


        TreeNode t = new TreeNode(1);

        // Right Branch 1 -> 7 | 7 -> 2 | 2 -> 9 (left), 2 -> 4 (right)
        t.right = new TreeNode(7);  // 1 -> 7 (right)
        t.right.right = new TreeNode(2); // 7 -> 2 (right)
        t.right.right.right = new TreeNode(9); // 2 -> 9 (right)
        t.right.right.left = new TreeNode(4); // 2 -> 4 (left)

        // Left Branch  1 -> 5 | 5 -> 6 (right), 5 -> 3 (left) | 3 -> 8 (right)
        t.left = new TreeNode(5); // 1 -> 5
        t.left.right = new TreeNode(6); // 5 -> 6 (right)
        t.left.left = new TreeNode(3);  // 5 -> 3 (left)
        t.left.left.right = new TreeNode(8); // 3 -> 8 (right)


        TreeNode tree = getInTree(t, 3);
        System.out.println(tree.data);
    }
}
