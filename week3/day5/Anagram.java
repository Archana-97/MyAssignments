package week3.day5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		String text1 = "stops";
		String text2 = "potss";
		
		int lengthOfText1 = text1.length();
		int lengthOfText2 = text2.length();
		
		if(lengthOfText1 == lengthOfText2)
		{
			char[] text1Array = text1.toCharArray();
			char[] text2Array = text2.toCharArray();
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			boolean isAnagram = true;
			for(int i=0;i<lengthOfText1;i++)
			{
//				System.out.println("text1 character " + text1Array[i]);
//				System.out.println("text2 character " + text2Array[i]);
				if(text1Array[i] != text2Array[i] )
				{
					isAnagram = false;
					break;
				}
				
			}
			if(isAnagram)
			{
				System.out.println("The given strings are Anagram.");
            } 
			else 
            {
                System.out.println("The given strings are not an Anagram.");
            }
			
		}
		else
		{
			System.out.println("The given strings are not an Anagram.");
		}
		
		
		

	}

}
