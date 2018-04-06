package assignment7;

public class extra {
	public String removeVowelsFromString(String input) {
		String str= input.replaceAll("[AEIOUaeiou]", "");
		return str;
	}
}
