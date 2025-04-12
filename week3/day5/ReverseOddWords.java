package week3.day5;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";      
		String[] splitedTest = test.split(" ");
		for(int i=0;i<splitedTest.length;i++)
		{
			if(i%2 != 0)
			{                                                        //0 1 2 3 4 5 6 7
				char[] testArray = splitedTest[i].toCharArray();     //s o f t w a r e
				int start = 0;
				int end = testArray.length-1;
				while(start<end)
				{
					char temp = testArray[start];                   // temp -s,  e -1st, s- last
					testArray[start] = testArray[end];
					testArray[end] = temp;
					start++;
					end--;
				}
				System.out.print(new String(testArray) + " ");
				
			}
			else
			{
				System.out.print(splitedTest[i] + " ");
			}
						
		}
		


	}

}
