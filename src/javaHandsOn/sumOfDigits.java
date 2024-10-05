package javaHandsOn;

public class sumOfDigits {

	public static void main(String[] args) {
		System.out.print(getSum(794));
	}

	public static int getSum(int x) {
		int result = 0;
		while (x != 0) {
			int num = x % 10;
			result = result + num;
			x = x / 10;
		}
		return result;
	}

}
