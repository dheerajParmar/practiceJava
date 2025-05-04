package topSdetPrograms.strings;

public class CountWordsInString {
    public static void main(String[] args){
        String str = "Java is good for Automation";
        countWords(str);
    }

    public static void countWords(String s){
        int count = 1;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.print(count);
    }
}
