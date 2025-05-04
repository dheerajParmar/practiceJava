package topSdetPrograms;

public class FibonacciSeries {
    public static void main(String[] args){
        int firstNum = 0;
        int secondNum = 1;
        int n = 30;

        System.out.println(firstNum);
        System.out.println(secondNum);
        for(int i=3; i<=n; i++){
            int nextNum = firstNum + secondNum;
            System.out.println(nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
