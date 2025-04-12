package week3.day5;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count =0;
		String[] textArray = text.split(" ");
		for(int i=0;i<textArray.length;i++)            // i=0 ,j=1 --,j=2
		{
			for(int j =i+1;j <textArray.length;j++)
			{
				if(textArray[i].equalsIgnoreCase(textArray[j]))
				{
					textArray[j] =  "     ";
					count++;
				}
			}
		}
		if(count > 0)
		{
			String output = String.join(" ", textArray);
			System.out.println(output);
		}
		else {
            System.out.println("No duplicates found.");
        }

	}

}
