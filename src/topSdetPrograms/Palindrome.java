package topSdetPrograms;

public class Palindrome {
    public static void main(String[] args){
        int x = 15521;
        System.out.print(palindromeOrNot(x));
    }

    public static boolean palindromeOrNot(int x){
        int rem;
        int rev =0;
        int temp = x;

        while(temp != 0){
            rem = temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;
        }
        if(rev == x){
            return true;
        }
        else
            return false;

    }
}
