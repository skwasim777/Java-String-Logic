package String;

public class CountStringCharacter {
		public static void main(String[] args) {
			String str = "wasim shaikh";
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=' ') {
					count++;
				}
			}
			System.out.println("Total Number of character in string " + count);
		}
}
