package programPractice;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// Java Program to Find the Largest Among Three Numbers

		int num1=9;
		int num2=312;
		int num3=44;
		
		if((num1>num2)&&(num1>num3))
		{
			System.out.println("Num1 is a greatest number");
		}
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println("Num2 is a greatest number");
		}
		else {
			System.out.println("Num3 is a greatest number");
		}

	}

}
