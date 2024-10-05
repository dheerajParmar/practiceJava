package javaHandsOn;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 12;
		int[] num = new int[n];
		num[0] = 0;
		num[1] = 1;

		for (int i = 2; i < n; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}

		for (int i : num) {
			System.out.println(i);
		}
	}
}