package topSdetPrograms.strings;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        String str = "Java is good programming langauge ";
        reverseStringWords(str);
    }

    public static void reverseStringWords(String s) {
        String[] words = s.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String newString = "";
            for (char ch : word.toCharArray()) {
                newString = ch + newString;
            }
            reverseString = reverseString + newString + " ";
        }
        System.out.print(reverseString);
    }
}