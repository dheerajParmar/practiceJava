package javaHandsOn;

public class SearchElementInArray {

	public static void main(String[] args) {
		int arr[] = {100, 200, 300, 600, 10};
		int search_element = 200;
		boolean flag = false;
		for(int x : arr) {
			if(x == search_element) {
				flag = true; 
			}
		}
		
		if(flag == true)
			System.out.println("Element present in Array");
		else
			System.out.println("Element not present in Array");

	}

}
