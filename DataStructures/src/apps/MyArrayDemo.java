package apps;

public class MyArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[] {10, 1, -4, 5, 12, 7};
        String[] names = new String[] {"Jake", "Name", "AnotherName"};
        char[] chars = new char[] {'a', 'b', 'c', 'D', 'T'};
        MyArrayForInteger numbers4 = new MyArrayForInteger(numbers);
        MyArrayForString myArrayForString = new MyArrayForString(names);
        MyArrayForChar myArrayForChar = new MyArrayForChar(chars);
        MyArraySortedForInteger integersSorted = new MyArraySortedForInteger(numbers);
        MyArraySortedForString stringSorted = new MyArraySortedForString(names);
        MyArraySortedForChar charSorted = new MyArraySortedForChar(chars);

        integersSorted.add(11);
        integersSorted.printArray();
        stringSorted.add("Hello");
        stringSorted.printArray();
        charSorted.add('u');
        charSorted.printArray();

//        numbers4.add(2);
//        numbers4.printArray();
//        myArrayForString.add("String");
//        myArrayForString.printArray();
//        myArrayForChar.add('Q');
//        myArrayForChar.printArray();
    }
}