package week3.day1;

public class Ass5Palindrome {

	public static void main(String[] args) {
		String text = "madam";
		String revText = "";
		int textLength = text.length();

		for (int i = textLength-1; i >= 0; i--) {
			revText = revText+text.charAt(i);	
			System.out.println(revText);
		}
		if (revText.equals(text)) 

			System.out.println("It is palindrome");
		else 
			System.out.println("It is not palindrome");}
}
