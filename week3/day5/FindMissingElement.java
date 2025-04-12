package week3.day5;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int input[] = {1,4,3,2,8,6,7};
		Arrays.sort(input);      //1,2,3,4,6,7,8       i=0,i<7,i++   1=1, 2=2,3=3,4=4,6=5
		for(int i=0;i<input.length;i++)
		{
			if(input[i] != i+1)
			{
				System.out.println(i+1);
				break;
				
			}
		}

	}

}
