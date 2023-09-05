package programPractice;

public class LeapYear {

	public static void main(String[] args) {
		// Java Program to Check Leap Year 
		
		int year = 2021;
		
		if(year%4==0||year%400==0&&year%100!=0)
		{
			System.out.println("Given year is a Leap year");
		}
		else
		{
			System.out.println("Given year is not a Leap year");
		}


	}

}
