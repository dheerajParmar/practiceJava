package topSdetPrograms;

public class PrimeNumber{
    public static void main(String[] args){
        int n = 155;
        boolean primeOrNot = isPrime(n);
        if(primeOrNot == true)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }

    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
