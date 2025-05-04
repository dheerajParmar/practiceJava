package topSdetPrograms;

public class sumOfDigits {
    public static void main(String[] args){
        int x = 2695;
        System.out.print(sumOfValues(x));
    }

    public static int sumOfValues(int x){
        int rem;
        int sum =0;
        int temp = x;

        while(temp != 0){
            rem = temp%10;
            sum += rem;
            temp = temp/10;
        }
        return sum;
    }
}