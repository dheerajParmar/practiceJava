package javaHandsOn;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {10,60,30,800,500,30,40,64,7000};
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}

}
