package javaHandsOn;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 371;
		int temp = num;
		double res = 0;
		while (temp != 0) {
			int n = temp % 10;
			res = res + Math.pow(n, 3);
			temp = temp / 10;
		}

		if (res == num) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
