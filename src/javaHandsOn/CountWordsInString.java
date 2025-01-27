package javaHandsOn;

public class CountWordsInString {

	public static void main(String[] args) {
		String s1 = "   Dheeraj Parmar  is    working  at Coforge Ltd";
		s1 = s1.trim();
		String words[] = s1.split("\\s+");  //regex to split when have one or more spaces.
		System.out.println(words.length);
		
	}

}
