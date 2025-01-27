package javaHandsOn;

public class RemoveWhiteSpacesInString {
	public static void main(String[] args) {
		String s = "Dh   e    e  ra  j ";
		System.out.println("Before removing spaces: " + s);
		s = s.replaceAll("\\s", "");  //regular expression usedd for space
		System.out.println("After removing spaces: " + s);
	}
}
