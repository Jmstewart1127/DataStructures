package apps.LinkedList;

public class RecursionPractice
{
    static int factorial(int n)
    {
        System.out.println("factorial "+n);
        if (n<=1)
            return 1;
        int res = n * factorial(n-1);
        System.out.println("about to return "+res);
        return res;
    }

    static int sumUpTo(int n)
    {
        if (n == 0)
            return 0;
        return n + sumUpTo(n-1);
    }

    static int sumFromTo(int a, int b)
    {
        if (a == b)
            return a;
        return sumFromTo(a+1,b) + a;
    }

    public static char printAlphabetHelper(char ch)
    {
        if (ch == 'Z') {
            System.out.print(ch);
            return ch;
        }
        System.out.print(ch);
        return printAlphabetHelper((char) (ch + 1));
    }
    public static void printAlphabet()
    {
        printAlphabetHelper('A');
    }

    public static double max(double a, double b)
    {
        if (a>b) return a;
        return b;
    }

    public static double findMaxHelper(double nums[],int start,int end)
    {
        if (start == end)
            return nums[end];
        return max(nums[start], findMaxHelper(nums, start + 1, end));
    }

    public static double findMax(double nums[])
    {
        return findMaxHelper(nums,0,nums.length-1);
    }

    public static boolean isLarger(int a, int b)
    {
        if (a == b)
            return false;
        if (a-1 == b)
            return true;
        if (a == 0)
            return false;
        return isLarger(a-1, b);
    }

    public static void printPrimeFactorsRecursion(int n, int divider)
    {
        if (n < divider)
            return;
        if (n % divider == 0)
        {
            System.out.println(divider);
            printPrimeFactorsRecursion(n / divider, divider);
        }
        else
        {
            divider++;
            printPrimeFactorsRecursion(n, divider);
        }
    }

    public static void printPrimeFactors(int n)
    {
        printPrimeFactorsRecursion(n, 2);
    }

    public static boolean subsetSumHelper(int numbers[], int target, int idx)
    {
        if (target == 0)
            return true;
        if (idx == 0 && target != 0)
            return false;
        if (numbers[idx-1] > target)
            return subsetSumHelper(numbers, target, idx-1);
        return subsetSumHelper(numbers,  target, idx-1) ||
            subsetSumHelper(numbers, target-numbers[idx-1], idx-1);
    }

    public static boolean subsetSum(int numbers[], int target)
    {
        return subsetSumHelper(numbers,target,numbers.length);
    }

    public static void printLinkedList(SLLNode<Integer> node)
    {
        if (node == null) return;
        System.out.print(node.info+" ");
        printLinkedList(node.next);
    }

    public static void printLinkedListReverse(SLLNode<Integer> node)
    {
        if (node == null) return;
        printLinkedListReverse(node.next);
        System.out.print(node.info+" ");
    }

    public static SLLNode<Integer> remove(SLLNode<Integer> node, int val)
    {
        if (node == null)
            return null;
        if (node.info == val) {
            return remove(node.next, val);
        } else {
            node.next = remove(node.next, val);
            return node;
        }
    }

    //	System.out.println(binarySearch(7,new int[] {2,3,5,10,14,15,20,30},0,7));
    public static int binarySearch(int target, int numbers[], int first, int last) {
        System.out.println("binarySearch: "+target+" "+first+" "+last);
        if (first > last) return -1;
        int midpoint = (first + last) / 2;
        if (target == numbers[midpoint])
            return midpoint;
        else if (target < numbers[midpoint])
            // search for the target in the first half of the array.
            return binarySearch(target, numbers, first, midpoint-1);
        else
            // search for the target in the first half of the array.
            return binarySearch(target, numbers, midpoint+1, last);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(sumUpTo(4));
        System.out.println(sumFromTo(10,12));
        printAlphabet();
        System.out.println();
        System.out.println("Max number is "+findMax(new double[]{6.0,22.0,3.0,5,99,7,11}));
        System.out.println(isLarger(10,11));
        printPrimeFactors(2*2*3*11*13*17);
        System.out.println(subsetSum(new int[]{2,3,5,7,11}, 12));
        System.out.println(binarySearch(10,new int[] {2,3,5,10,14,15,20,30},0,7));
//
        SLLNode<Integer> list=null, newNode;
        for(int i=0;i<10;i++)
        {
            newNode = new SLLNode<Integer>((int)(Math.random()*5));
            newNode.next = list;
            list = newNode;
        }
//
        System.out.println("List contents are...");
        printLinkedList(list);
        System.out.println();
        printLinkedListReverse(list);
        list = remove(list, 0);
        System.out.println();
        System.out.println("List contents are...");
        printLinkedList(list);
    }
}
