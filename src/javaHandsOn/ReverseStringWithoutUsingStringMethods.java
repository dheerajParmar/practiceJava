package javaHandsOn;

import org.testng.annotations.Test;

public class ReverseStringWithoutUsingStringMethods {
	
	@Test
	void reverseString() {
		String s = "Selenium";
		String rev = "";
		
		char ch[] = s.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			rev += ch[i];
		}
		System.out.println("Reversed String: "+ rev);
	}
}
