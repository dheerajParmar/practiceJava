package javaHandsOn;

public class CountEvenOddInArray {

	public static void main(String[] args) {
		int arr[] = {24,12,9,8,23,27,90,23,0};
		int evenCount = 0;
		int oddCount = 0;
		
		for(int x : arr) {
			if(x%2 == 0)
				evenCount++;
			else 
				oddCount++;
			
		}
		System.out.println("Even Count: "+ evenCount);
		System.out.println("Odd Count: "+ oddCount);

	}

}
