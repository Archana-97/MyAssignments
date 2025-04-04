package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =6;
		int firstno = 0;
		int secondno = 1;
System.out.println(firstno);
System.out.println(secondno);

		for (int i = 0; i < n; i++) {
			int nextno = firstno + secondno;
			System.out.println(nextno);
			firstno = secondno;
			secondno = nextno;
		}
		

	}

}
