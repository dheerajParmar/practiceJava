package javaHandsOn;

public class CharecatrsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Dheeraj Parmar";
		System.out.println(charCount(s));

	}

	public static int charCount(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;
		}
		return count;
	}
}
