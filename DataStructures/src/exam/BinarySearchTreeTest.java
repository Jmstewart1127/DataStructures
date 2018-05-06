package exam;

import apps.BinaryTree.BSTNode;

public class BinarySearchTreeTest {

    static boolean isBSTHelper(BSTNode<Integer> node) {
        if (node == null)
            return true;
        if (node.left == null)
            return true;
        if (node.right == null)
            return true;
        if (node.info < node.left.info || node.info > node.right.info)
            return false;
        return (isBSTHelper(node.left) &&
                isBSTHelper(node.right));
    }

    static boolean isBST(BSTNode<Integer> node) {
        // if there is any node whose value is smaller than its left child
        // or larger than right child, returns false
        // Otherwise, returns true;
        return isBSTHelper(node);
    }
    public static void main(String[] args) {
        BSTNode<Integer> node1 = new BSTNode<Integer>(2);
        BSTNode<Integer> node2 = new BSTNode<Integer>(4);
        BSTNode<Integer> node3 = new BSTNode<Integer>(5);
        BSTNode<Integer> node4 = new BSTNode<Integer>(7);
        BSTNode<Integer> node5 = new BSTNode<Integer>(8);
        BSTNode<Integer> node6 = new BSTNode<Integer>(11);
        BSTNode<Integer> node7 = new BSTNode<Integer>(13);
        node4.left = node2;
        node4.right = node6;
        node2.left = node1;
        node2.right = node3;
        node6.left = node5;
        node6.right = node7;

        System.out.println(isBST(node4));
        node1.info = 10;
        System.out.println(isBST(node4));
        System.out.println(isBST(node2));
        System.out.println(isBST(node6));
    }
}