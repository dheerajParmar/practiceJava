package javaHandsOn;

public class CountOccurenceOfCharInString {

	public static void main(String[] args) {
		//lets count occurence of 'a' in below string
		String s1 = "java selenium cucumber testng apis appium";
		int lengthOfString = s1.length();
		String temp = s1.replaceAll("a", ""); 
		System.out.println("Count of char 'a' is: " + (lengthOfString - temp.length()));

	}

}
