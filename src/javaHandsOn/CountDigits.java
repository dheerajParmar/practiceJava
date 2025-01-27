package javaHandsOn;

import org.testng.annotations.Test;

public class CountDigits {
	
	@Test
	void CountNumberOfDigits() {
		int n = 393;
		int count = 0;
		
		while(n > 0) {
			n = n/10;
			count += 1;
		}
		System.out.println(count);
	}
	
	@Test
	void CountNumberOfEvenAndOddDigits() {
		int n = 23456;
		int even = 0;
		int odd = 0;
		int rem = 0;
		
		while(n > 0) {
			rem = n%10;
			if(rem % 2 == 0) 
				even += 1;
			else 
				odd += 1;
			
			n = n/10;
		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}
}
