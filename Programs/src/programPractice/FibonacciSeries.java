package programPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Java Program to Display Fibonacci Series till 6 terms = 0 1 1 2 3 5 8..
		
		int num =6;
		int fterm=0;
		int sterm=1;
		
		for(int i=0; i<=num; i++)
		{
			System.out.println(fterm);
			
			int nxtterm =fterm+sterm;
			fterm=sterm;
			sterm=nxtterm;
			
				
			
		}
		
		

	}

}
