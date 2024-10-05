package javaHandsOn;

public class ReverseString {
	static String result = "";
	public static void main(String[] args) {
		String s1 = "Dheeraj";
		reverseString(s1);
		System.out.println(result);
	}
	
	public static String reverseString(String input) {
		for(int i=input.length()-1; i >= 0; i--) {
			result += input.charAt(i);
		}
		return result;
	}

}
