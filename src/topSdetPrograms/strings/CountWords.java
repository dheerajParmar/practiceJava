package topSdetPrograms.strings;

public class CountWords {
    public static void main(String[] args){
        String s = "    Welcome to java world Welcome to Python";
        s = s.trim();
        String[] words = s.split(" ");
        System.out.print(words.length);
    }
}