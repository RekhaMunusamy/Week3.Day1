package week3.day1;

public class Ass5FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$";
		//String lowerCase = test.toLowerCase();
		int letter = 0; int number = 0; int space = 0; int specChar = 0 ;
		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if(Character.isLetter(charArray[i]))
			{
				letter++;
			}
			else if(Character.isDigit(charArray[i])) {
				number++;
			}
			else if(Character.isSpaceChar(charArray[i])) {
				space++;
			}

			else {
				Character.isSpaceChar(charArray[i]);
				specChar++;			
			}
		}
			System.out.println("No of letters : " +letter);
			System.out.println("No of number : " +number);
			System.out.println("No of spaces : " +space);
			System.out.println("No of special character : " +specChar);
		}

	}


