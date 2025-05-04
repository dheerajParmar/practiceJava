package topSdetPrograms;

public class countDigitsInNumber {
    public static void main(String[] args) {
        long n = 34590035688326L;
        countNumberOfDigits(n);
    }

    public static void countNumberOfDigits(long n){
        String s = Long.toString(n);
        System.out.print(s.length());
    }
}
