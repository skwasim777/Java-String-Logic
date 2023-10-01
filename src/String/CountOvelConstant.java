package String;

public class CountOvelConstant {
	public static void main(String[] args) {
		String str = "My World Is My Parents";
		int countV = 0;
		int constant = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				countV++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				constant++;
			}
		}
		System.out.println("Number of vowels " + countV);
		System.out.println("Number of constant " + constant);
	}
}
