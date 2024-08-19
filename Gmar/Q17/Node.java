package Gmar.Q17;

public class Node {
    public int data;
    public Node left, right;

    public boolean isLeaf() {
        return left == null && right == null;
    }
}
