package week3.day1;

import java.util.Arrays;

public class Ass5Anagram {

	public static void main(String[] args) {
		String s1 = "stops";
		String s2 = "posts";
		if (s1.length()!= s2.length())
		{
			System.out.println("Not a Anagarom");
		}
		else {
			char[] a = s1.toCharArray();
			char[] b = s2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			boolean result = Arrays.equals(a, b);	
			
			if(result==true)
			{
				System.out.println("Anagarom");	
			}
			
		}
	}

}
