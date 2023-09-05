package programPractice;

public class NumOfOccurance {

	public static void main(String[] args) {
		// WAP to count no of occurrence of single char
		
		String s ="asadfasa";
		int count = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a')
			{
				count = count + 1;
			}
		}
		System.out.println(count);

	}

}
