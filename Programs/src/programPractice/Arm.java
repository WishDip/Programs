package programPractice;

public class Arm {

	public static void main(String[] args) {


		int num=370;
		int length=0;
		int reminder=0;
		
		int temp=num;
		while(temp!=0)
		{
			temp=temp/10;
			length=length+1;
		}
		
		int temp2=num;
		int arm=0;
		while(temp2!=0)
		{
			reminder= temp2%10;
			
			int mul=1;
			for(int i=1; i<=length; i++)
			{
				mul=mul*reminder;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		if(arm==num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}
		
	}

}
