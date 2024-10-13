package javaHandsOn;

public class PrintPyramidTriangle {

	public static void main(String[] args) {
		int n = 4;
		int k = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}

	}

}
