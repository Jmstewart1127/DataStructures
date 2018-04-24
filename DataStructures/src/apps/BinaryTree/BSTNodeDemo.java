package apps.BinaryTree;

public class BSTNodeDemo {

    public static BSTNode<Integer> generate() {
        BSTNode<Integer> bstNode1 = new BSTNode<>(2);
        BSTNode<Integer> bstNode2 = new BSTNode<>(3);
        BSTNode<Integer> bstNode3 = new BSTNode<>(5);
        BSTNode<Integer> bstNode4 = new BSTNode<>(8);
        BSTNode<Integer> bstNode5 = new BSTNode<>(10);
        BSTNode<Integer> bstNode6 = new BSTNode<>(11);
        BSTNode<Integer> bstNode7 = new BSTNode<>(15);
        bstNode4.left = bstNode2;
        bstNode4.right = bstNode2;
        bstNode2.left = bstNode1;
        bstNode2.right = bstNode3;
        bstNode6.left = bstNode5;
        bstNode6.right = bstNode7;
        return bstNode4;
    }

    public static void preOrder(BSTNode<Integer> node) {
        if (node == null)
            return;
        System.out.print(node.info + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(BSTNode<Integer> node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.info + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BSTNode<Integer> tr = generate();
        preOrder(tr);
        System.out.println();
        inOrder(tr);
    }

}
