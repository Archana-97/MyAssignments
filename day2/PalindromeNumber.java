package week1.day2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        System.out.print(input);
         int length = String.valueOf(input).length();
         int number = input; 
         int reverse =0;
         
         while (input != 0)
         {
        	 int digit = input % 10;
        	 reverse = reverse *10 + digit;
        	 input = input/10;        	 
         }
         
         if  (number == reverse)
         {
        	 System.out.println( " is a palindrome number");
         }
         else
         {
        	 System.out.println(" is not a palindrome number");
         }

	
}

	}

