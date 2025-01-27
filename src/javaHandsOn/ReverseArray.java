package javaHandsOn;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {34, 57, 58, 15, 567, 597};
		int length = arr.length;
		int mid = Math.floorDiv(length, 2);
		int temp;
		
		for(int i=0; i <= mid; i++) {
			temp = arr[i];
			arr[i] = arr[length-i-1];
			arr[length-i-1] = temp;
		}
		
		for(int i=0; i<length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}