
package week3.day1;

import java.util.Iterator;

public class Ass5CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		
		  int count = 0; 
		  char[] charArray = str.toCharArray();
		  
		  
		  for (int i = 0; i < charArray.length; i++)
		
		if (str.charAt(i)=='e')
		{
			
			count = count+1;
			
		}

			System.out.println("The number of occurance of e is " +count);

	}

}
