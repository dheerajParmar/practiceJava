package topSdetPrograms.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedCharInStringByHashMap {
    public static void main(String[] args){
        String s = "AaabbCCCCccCC";
        char[] c = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char ch: c){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';

        for (Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue() > maxCount){
                 maxCount = entry.getValue();
                 maxChar = entry.getKey();
            }
        }
        System.out.print(maxChar);
    }
}
