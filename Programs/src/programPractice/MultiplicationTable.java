package programPractice;

public class MultiplicationTable {

	public static void main(String[] args) {
		// Java Program to Generate Multiplication Table (1 to 10)

		//8= 8*1 8*2... 8*10
		
		int num=8;
		int mul=1;
		
		for(int i=1; i<=10; i++)
		{
			mul=num*i;
			System.out.println(mul);
		}

	}

}
