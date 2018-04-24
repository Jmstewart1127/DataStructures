package apps;

public class InsertionAndDeletion {

    static int findMaxIdx(int[] nums) {
        int greatest = nums[0];
        int greatestIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > greatest) {
                greatest = nums[i];
                greatestIndex = i;
            }
        }
        return greatestIndex;
    }

    static void generateNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10;
        }
    }

    static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    static int linearSearch(int[] nums, int number) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                System.out.println("linear: " + i);
                return i;
            }
        }
        return -1;
    }

//    static int[] remove(int[] numbers, int indexValue) {
//        int index = linearSearch(numbers, indexValue);
//        int[] newNumbers;
//        if (index >= 0) {
//            numbers[index] = numbers[numbers.length - 1];
//            newNumbers = new int[numbers.length - 1];
//            for (int i = 0; i < newNumbers.length; i++) {
//                newNumbers[i] = numbers[i];
//            }
//            numbers = newNumbers;
//        }
//        return numbers;
//    }

//    static int[] add(int[] numbers, int indexValue) {
//        int index = linearSearch(numbers, indexValue);
//        int[] newNumbers;
//        if (index >= 0) {
//            numbers[index] = numbers[numbers.length - 1];
//            newNumbers = new int[numbers.length + 1];
//            newNumbers[numbers.length] = index;
//            for (int i = 0; i < numbers.length; i++) {
//                newNumbers[i] = numbers[i];
//            }
//            numbers = newNumbers;
//        }
//        return numbers;
//    }

    static int[] add(int[] numbers, int value) {
        int[] newNumbers = new int[numbers.length + 1];
        newNumbers[numbers.length] = value;
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        return newNumbers;
    }

//    static int binarySearch(int[] nums, int val) {
//        int start = 0;
//        int end = nums.length -1;
//        while (start <= end) {
//            int midpoint = (start + end) / 2;
//            if (val == nums[midpoint]) {
//                return midpoint;
//            }
//            if (val < nums[midpoint]) {
//                end = midpoint - 1;
//            } else {
//                start = midpoint + 1;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        char[] numbers = {0, 1, 2, 3, 4, 5, 6};
//        int[] numbers3 = new int[1000000];
//        generateNumbers(numbers3);
//        printArray(numbers);
//        numbers = remove(numbers, 1);
//        printArray(numbers);
//        numbers = remove(numbers, 5);
//        printArray(numbers);
//        numbers = add(numbers, 8);
//        printArray(numbers);
//        MyArrayForIntegers numbers2 = new MyArrayForIntegers();
////        MyArrayForIntegers numbers3 = new MyArrayForIntegers(numbers);
//        MyArrayForIntegers numbers2 = new MyArrayForIntegers(numbers);
//        MyArraySortedForChar sorted = new MyArraySortedForChar(numbers);
//        System.out.println(numbers2.search(6));
//        numbers2.printArray();
//        numbers2.remove(1);
//        numbers2.printArray();
//        numbers2.add(12);
//        numbers2.printArray();
//        numbers2.remove(1);
//        numbers2.printArray();
//        numbers2.add(33);
//        numbers2.printArray();
//        sorted.add(3);
//        sorted.printArray();
    }

}
