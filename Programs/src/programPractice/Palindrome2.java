package programPractice;

public class Palindrome2 {

	public static void main(String[] args) {
		
		int num=12321;
		int temp=num;
		int reminder=1;
		int rev=0;
		
		while(temp!=0)
		{
			reminder=temp%10;
			rev=rev*10+reminder;
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
