package topSdetPrograms.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCountInString{
    public static void main(String[] args) {
        String s = "Learn Java Programming";
        duplicateCount(s);
    }

    public static void duplicateCount(String s){
        char[] strArray = s.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch) + 1);
            }
            else{
                hm.put(ch, 1);
            }
        }

        for(char ch : hm.keySet()){
            if(hm.get(ch) > 1 && ch != ' ') {
                System.out.println(ch + ": " + hm.get(ch));
            }

        }
    }
}
