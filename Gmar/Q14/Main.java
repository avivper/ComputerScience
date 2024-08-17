package Gmar.Q14;

public class Main extends BinTree {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree.num = 5;

        tree.right = new TreeNode();
        tree.right.num = 6;

        tree.left = new TreeNode();
        tree.left.num = 2;

        int countEven = BinTree.countNodes(tree);
        System.out.println(countEven);
        System.out.println();
        BinTree.printAllInLevel(tree, 0);
    }

    // Question C: What is the complexity time of printAllInLevel and EvenNodes?
    // O(n) for each of them. No, there no difference on time.


}
