package topSdetPrograms;

public class Factorial {
    public static void main(String[] args){
        int n = 6;

        for(int i=n-1; i>0; i--){
            n = n*i;
        }
        System.out.print(n);
    }
}