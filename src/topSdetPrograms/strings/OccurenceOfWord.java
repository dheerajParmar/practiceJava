package topSdetPrograms.strings;

import java.util.HashMap;

public class OccurenceOfWord {
    public static void main(String[] args){
        String s = "Dheeraj Parmar Ajay Parmar Neelam Parmar";
        wordCount(s);
    }

    public  static void wordCount(String s){
        HashMap<String, Integer> hm = new HashMap<>();
        String[] words = s.split(" ");
        for(String str : words){
            if(hm.containsKey(str)){
                hm.put(str, hm.get(str) + 1);
            }
            else {
                hm.put(str, 1);
            }
        }
        for(String key : hm.keySet()){
            System.out.println(key + ": " +hm.get(key));
        }
    }
}