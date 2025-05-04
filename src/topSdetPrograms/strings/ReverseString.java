package topSdetPrograms.strings;

import org.testng.annotations.Test;

public class ReverseString {
    public static void main(String[] args){
        String str = "Dheeraj Parmar";
        reverseString(str);
    }

    public static void reverseString(String s){
        String result = "";
        for(char ch : s.toCharArray()){
            result = ch + result;
        }

        System.out.print(result);
    }
}
