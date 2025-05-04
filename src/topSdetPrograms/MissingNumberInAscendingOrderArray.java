package topSdetPrograms;

public class MissingNumberInAscendingOrderArray {
    public static void main(String[] args) {
        int[] arr = {11,12,13,15,};
        int i=0;
        int count = arr[0];
        while(i<arr.length){
            if(arr[i] == count){
                count ++;
                i++;
            }
            else{
                System.out.print(count);
                break;
            }

        }
    }
}
