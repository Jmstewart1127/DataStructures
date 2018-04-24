package apps.BinaryTree;

public class MyBST<T extends Comparable> {
    BSTNode<T> root;

    public MyBST() {
        root = null;
    }

    public BSTNode<T> max() {
        // returns the node with minimum value
        if (root == null)
            return null;
        BSTNode<T> node = root;
        while(node.right != null)	// Keep going down to the left if there is left child.
            node = node.right;
        System.out.println(node.info);
        return node;
    }

    public BSTNode<T> min() {
        // returns the node with minimum value
        // Use recursion instead of loop.
        // Need a helper function minHelper(BSTNode<T> node).
        return minHelper(root);
    }

    private BSTNode<T> minHelper(BSTNode<T> node) {
        if (node.left == null) {
            System.out.println(node.info);
            return node;
        }
        else return minHelper(node.left);
    }

    public int height() {
        // returns the height of the tree
        // Just depend on searchHelper. This is complete
        return heightHelper(root);
    }
    private int heightHelper(BSTNode<T> node) {
        // returns the height of the tree from the given node down
        // Use recursion
        // Need work
        if (node == null)
            return 0;
        else {
            if (heightHelper(node.left) > heightHelper(node.right))
                return heightHelper(node.left)+1;
            else return heightHelper(node.right)+1;
        }
    }

    public BSTNode<T> search(T val) {
        // returns the node that has the same value to the given input
        // Just depend on searchHelper. This is complete
        return searchHelper(root, val);
    }
    private BSTNode<T> searchHelper(BSTNode<T> node, T val) {
        // search from the given node
        // Use recursion
        // Need work
        if (node == null) {
            System.out.println("NODE NOT FOUND");
            return null;
        }
        // if val is equal to node.info, then return the node.
        if (val.equals(node.info)) {
            System.out.println(node.info);
            return node;
        }
        // if val is smaller than node.info, then return searchHelper(node.left, val)
        if (val.compareTo(node.info) < 0)
            return searchHelper(node.left, val);
        // if val is larger than node.info, then return searchHelper(node.right, val)
        if (val.compareTo(node.info) > 0)
            return searchHelper(node.right, val);
        return node;
    }

    public void add(T val) {
        // Just depend on addHelper. This is complete
        root = addHelper(root, val);
    }

    private BSTNode<T> addHelper(BSTNode<T> node, T val){
        // Use recursion.
        // Need work

        // This functions returns a node (either current one or new node)
        // and its parent will make connection to the returned node
        if (node == null) {
            node = new BSTNode<>(val);
            return node;
        }
        // if val is smaller than or equal to node.info, then node.left = addHelper(node.left, val)
        if (val.compareTo(node.info) <= 0)
            node.left = addHelper(node.left, val);
        // if val is larger than node.info, then node.right = addHelper(node.right, val)
        if (val.compareTo(node.info) > 0)
            node.right = addHelper(node.right, val);
        return node;
    }

    public void generate1() {
        BSTNode<Integer> node1 = new BSTNode<Integer>(2);
        BSTNode<Integer> node2 = new BSTNode<Integer>(3);
        BSTNode<Integer> node3 = new BSTNode<Integer>(5);
        BSTNode<Integer> node4 = new BSTNode<Integer>(8);
        BSTNode<Integer> node5 = new BSTNode<Integer>(10);
        BSTNode<Integer> node6 = new BSTNode<Integer>(11);
        BSTNode<Integer> node7 = new BSTNode<Integer>(15);
        node4.left = node2;
        node4.right = node6;
        node2.left = node1;
        node2.right = node3;
        node6.left = node5;
        node6.right = node7;
        root = (BSTNode<T>) node4;
    }

    public void PreOrder(BSTNode<T> node) {
        if (node==null)
            return;
        System.out.print(node+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void InOrder(BSTNode<T> node) {
        if (node==null)
            return;
        InOrder(node.left);
        System.out.print(node.info+" ");
        InOrder(node.right);
    }

    public void PostOrder(BSTNode<T> node) {
        if (node==null)
            return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node+" ");
    }

    public void printBST() {
        InOrder(root);
        System.out.println();
    }

    public boolean empty() { return (root == null); }

    public boolean full() { return false; }

    public int size() {
        // returns the size of the binary search tree
        return sizeHelper(root);
    }

    private int sizeHelper(BSTNode<T> node) {
        // returns the size of the binary search tree from the given node
        // Need work here
        if (node == null) return 0;
        return 1 + sizeHelper(node.left) + sizeHelper(node.right);
    }

}