package topSdetPrograms;

public class CountNumberOfDigits {
    public static void main(String[] args){
        int x = 10990;
        System.out.print(countDigit(x));
    }
    public static int countDigit(int x){
        int no = x;
        int count = 0;

        if(no < 0){
            no = no*-1;
        }
        if(no == 0){
            return 1;
        }

        while(no != 0){
            no = no/10;
            count++;
        }
        return count;

    }
}
