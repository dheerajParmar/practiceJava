package topSdetPrograms.strings;

public class PalindromeString {
    public static void main(String[] args){
        String s = "MaDAm";
        boolean flag = checkPalindrome(s);
        if(flag == true){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }

    public static boolean checkPalindrome(String s){
        s= s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}