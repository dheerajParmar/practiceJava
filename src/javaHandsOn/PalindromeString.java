package javaHandsOn;

public class PalindromeString {
		static String result = "";
		
		public static void main(String[] args) {
			String s1 = "sksKS";
			result = reverseString(s1);
			if(result.equalsIgnoreCase(s1))
				System.out.println("Palindrome String");
			else 
				System.out.println("Non Palindrome String");
		}
		
		public static String reverseString(String input) {
			for(int i=input.length()-1; i >= 0; i--) {
				result += input.charAt(i);
			}
			return result;

	}

}
