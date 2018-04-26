package exam;

public class HeapDemo {
    static int parentIdx(int idx) { return (idx-1)/2; }
    static int leftIdx(int idx) { return 2*idx+1; }
    static int rightIdx(int idx) { return 2*idx+2; }
    static boolean isMaxHeap(int[] nums) {
        // for each node,
        // 		if left child exists and the child is larger, then return false
        // 		if right child exists and the child is larger, then return false
        // no such case happened. return true
        for (int i=0; i<nums.length/2-1; i++) {
            if (nums[leftIdx(i)] > nums[i])
                return  false;
            if (nums[rightIdx(i)] > nums[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(parentIdx(2));
        System.out.println(parentIdx(3));
        System.out.println(isMaxHeap(new int[]{10,9,8,7,6,5,4,3,2,1}));
        System.out.println(isMaxHeap(new int[]{100,19,36,17,3,25,1,2,7}));
        System.out.println(isMaxHeap(new int[]{100,19,36,17,23,25,1,2,7}));
    }
}
