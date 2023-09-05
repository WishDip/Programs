package programPractice;

public class NumberOfDigitsInInteger {

	public static void main(String[] args) {
		// Java Program to Count Number of Digits in an Integer
		
		int num = 12345777;
		int count=0;
		
		while(num!=0)
		{
			    num=num/10;
				count=count+1;			
		}
		System.out.println(count);

	}

}
