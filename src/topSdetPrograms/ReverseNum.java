package topSdetPrograms;

public class ReverseNum {
    public static void main(String[] args){
        int no = 157;
        int rev=0;
        int rem;
        int temp = no;
        while(no > 0){
            rem = no%10;
            rev = rev*10 + rem;
            no = no/10;
        }
        System.out.print(rev);
    }
}
