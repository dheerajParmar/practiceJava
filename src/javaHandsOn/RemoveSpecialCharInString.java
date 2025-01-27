package javaHandsOn;

public class RemoveSpecialCharInString {

	public static void main(String[] args) {
		String junkString = "@$(&*&Dhe@)+#!^era&*&^&j Par&**&^&#!)#*^^?mar";
		String cleanedString = junkString.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(junkString);
		System.out.println(cleanedString);
	}

}
