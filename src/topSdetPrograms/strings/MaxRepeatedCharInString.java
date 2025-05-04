package topSdetPrograms.strings;

public class MaxRepeatedCharInString {
    public static void main(String[] args){
        String s = "AaabbCCCCccCC";
        maxOccuringChar(s);
    }

    public static void maxOccuringChar(String s){
        int[] arr = new int[256];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
        }

        int max = -1;
        char ch = ' ';

        for(int i=0; i<s.length(); i++){
            if(max < arr[s.charAt(i)]){
                max = arr[s.charAt(i)];
                ch = s.charAt(i);
            }
        }
        System.out.print(ch);
    }
}
