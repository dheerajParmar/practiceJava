package javaHandsOn;

import org.testng.annotations.Test;

public class PalindromeNumber {
	
	@Test
	void CheckPalindrome() {
		int n = 12121;
		int temp = n;
		int rem = 0;
		int rev = 0;
		
		while(n > 0) {
			rem = n%10;
			rev = (rev * 10) + rem;
			n = n/10;
		}
		String result = (rev == temp) ? "Palindrome" : "Not Palindrome";   //Ternary Operator
		System.out.println(result);
	}

}
