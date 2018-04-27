package exam;

import java.util.HashMap;

public class WordCount {
    static void countWords(String[] words) {
        // use HashMap with each item as a (word, count) pair
        HashMap<String,Integer> wTable = new HashMap<String, Integer>();
        for (int i=0; i<words.length; i++) {
            // if the word exist, then increase the count by 1
            if (wTable.get(words[i]) != null)
                wTable.put(words[i], wTable.get(words[i])+1);
            // if not, add a new item (word, 1)
            else
                wTable.put(words[i], 1);
        }
        // print the table
        wTable.forEach((k,v)->System.out.println(k+": "+v));
    }
    public static void main(String[] args) {
        String doc = "hello world hi hi guys hello ladies hi boys";
        String[] words = doc.split(" ");
        countWords(words);
    }
}
