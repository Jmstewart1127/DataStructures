package apps.BinaryTree;

public class MyBSTDemo {

    public static void main(String[] args) {
        MyBST<Integer> tr1 = new MyBST<Integer>();
        tr1.generate1();
        tr1.printBST();
        System.out.println("tree size: " + tr1.size());

        // Add more codes below to test //max(), //min(), //height(), //search(), //add()
        // and use printBST() often to see if the functions work
        System.out.print("Search For 2: ");
        tr1.search(2);
        System.out.println("Added '1'");
        tr1.add(1);
        tr1.printBST();
        System.out.println("Height: " + tr1.height());
        System.out.println("Size: " + tr1.size());
        System.out.print("Max: ");
        tr1.max();
        System.out.print("Min: ");
        tr1.min();
        tr1.printBST();
    }

}