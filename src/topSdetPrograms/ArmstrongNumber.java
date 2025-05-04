package topSdetPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 371;
        armstrongCheck(n);
    }

    public static void armstrongCheck(int n){
        int rem=0;
        int temp = n;
        int result = 0;

        while(n > 0){
            rem = n%10;
            result = result + (rem * rem * rem);
            n = n/10;

        }

        if(result == temp){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}
