package programPractice;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// . Java Program to Find Factorial of a Number  5=5*4*3*2*1
		
		int num =5;
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
						
		}
		System.out.println(fact);


	}

}
