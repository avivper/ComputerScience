package Gmar.Q17;

public class Main {
    public static boolean isRich(Node node) {
        if (node == null) {
            return false;
        }
        if (node.right == null || node.left == null) {
            return false;
        }
        if (!node.isLeaf()) {
            if (!node.right.isLeaf() && !node.left.isLeaf()) {
                return true;
            }
        }
        return isRich(node.left) || isRich(node.right);
    }

    public static void main(String[] args) {
        Node noRich = new Node();
        noRich.data = 1;
        noRich.right = new Node();
        noRich.right.data = 2;
        noRich.left = new Node();
        noRich.left.data = 3;
        noRich.left.left = new Node();
        noRich.left.left.data = 4;
        noRich.left.right = new Node();
        noRich.left.right.data = 5;
        noRich.left.right.left = new Node();
        noRich.left.right.left.data = 6;

        Node rich = new Node();
        rich.data = 1;
        rich.right = new Node();
        rich.right.data = 2;
        rich.left = new Node();
        rich.left.data = 3;
        rich.left.left = new Node();
        rich.left.left.data = 4;
        rich.left.left.left = new Node();
        rich.left.left.left.data = 5;
        rich.left.left.right = new Node();
        rich.left.left.right.data = 6;
        rich.left.right = new Node();
        rich.left.right.data = 7;
        rich.left.right.left = new Node();
        rich.left.right.left.data = 8;

        System.out.println(isRich(noRich) + "\n" + isRich(rich));
    }
}
