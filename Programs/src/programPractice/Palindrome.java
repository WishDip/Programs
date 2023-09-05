package programPractice;

public class Palindrome {

	public static void main(String[] args) {
		// 25.	Java Program to Check Palindrome 
		
		int num=121;
		int rem=1;
		int rev=0;
		
		int temp=num;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
						
		}
			
			if(rev==num)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		

	}

}
