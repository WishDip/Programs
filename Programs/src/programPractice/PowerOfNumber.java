package programPractice;

public class PowerOfNumber {

	public static void main(String[] args) {
		//24.	Java Program to Calculate the Power of a Number  2^3= 2*2*2
		
		int base=3;
		int exp=3;
		int res=1;
		
		while(exp>0)
		{
			res=res*base;
			exp--;
		}
		System.out.println(res);
		
	}

}
