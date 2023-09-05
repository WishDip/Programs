package programPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		// Java Program to Reverse a Number
		
		int num = 1234;
		int rem;
		
		while(num!=0)
		{
			rem=num%10;
			System.out.print(rem);
			num=num/10;
			
					
		}

	}

}
