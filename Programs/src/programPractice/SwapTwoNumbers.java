package programPractice;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// Java Program to Swap Two Numbers

		int a= 20;
		int b = 10;
		
		System.out.println("Number before Swap:"+ a +", "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Number before Swap:"+ a +", "+b);

	}

}
