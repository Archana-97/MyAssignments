package assignments;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String Text = input.nextLine();
//		System.out.println(Text);
		String[] words = Text.split(" ");
		int count = words.length;
//		System.out.println(count);
		String lastword = words[count-1];
		int lengthOfLastword = lastword.length();
		System.out.println("Length of the last word :" + lengthOfLastword );

	}

}
