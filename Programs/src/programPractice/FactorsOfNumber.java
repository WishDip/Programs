package programPractice;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// Java Program to Display Factors of a Number
		
		int num =3;
		
		
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
			
		}

	}

}
