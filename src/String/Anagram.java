package String;

import java.util.Arrays;

public class Anagram {
		public static void main(String[] args) {
			String str1 = "Brag";
			String str2 = "Grab";
			// converting both string to lower case 
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			
			// cheking for the length of string 
			if(str1.length()!=str2.length()) {
				System.out.println("Both the string are not anagram ");
			}else {
				// converting both arrays to cahr array 
				char[] string1 = str1.toCharArray();
				char[] string2 = str2 .toCharArray();
				
				// sorting the array using built in function
				Arrays.sort(string1);
				Arrays.sort(string2);
				
				// comparing both arrays using builtin fuction equals()
				if (Arrays.equals(string1,string2)==true) {
					System.out.println("Both String are Angram ");
				}else {
					System.out.println("Both String are not Anagram");
				}
			}
		}
}
