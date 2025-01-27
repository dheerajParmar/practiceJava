package javaHandsOn;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = {10,20,400,50,600};
		int sum = 0;
		
		for(int x : arr) {
			sum += x;
		}
		System.out.println(sum);
	}

}
