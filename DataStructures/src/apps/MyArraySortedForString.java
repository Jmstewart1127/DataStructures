package apps;

public class MyArraySortedForString {
    private String[] names;
    private int numElements = 0;
    public MyArraySortedForString() {
        names = new String[5];
    }
    public MyArraySortedForString(int capsize){
        names = new String[capsize];
    }
    public MyArraySortedForString(String[] names){
        this.names = new String[names.length];
        for(int i=0; i<names.length; i++)
            this.add(names[i]);
    }
    public void printArray(){
        System.out.print("printArray(): ");
        for(int i=0; i<numElements; i++)
            System.out.print(names[i]+" ");
        System.out.println();
    }
    public int search(String name) {
        return binarySearch(name);
    }
    int binarySearch(String name) {
        int start = 0;
        int end = names.length-1;
        while(start <= end){
            int midpoint = (start + end)/2;
            if(name.equals(names[midpoint]))
                return midpoint;
            if (name.compareTo(names[midpoint]) > 0)
                end = midpoint - 1;
            else
                start = midpoint + 1;
        }
        return -1;
    }

    public void remove(String name) {
        int index = binarySearch(name);
        if (index >= 0) {
            for(int i=index; i<numElements-1; i++)
                names[i] = names[i+1];
            numElements--;
        }
    }
    private void enlarge() {
        String[] new_numbers = new String[2* names.length];
        for(int i = 0; i< names.length; i++)
            new_numbers[i] = names[i];
        names = new_numbers;
    }
    public void add(String val) {
        if (names.length == numElements)
            enlarge();
        int i = numElements - 1;
        while (i>=0 && names[i].compareTo(val) > 0) {
            names[i+1] = (names[i]);
            i--;
        }
        names[i+1] = val;
        numElements++;
    }

    public int size() { return numElements; }
    public int capsize() { return names.length; }
}
