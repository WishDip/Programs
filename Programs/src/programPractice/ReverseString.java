package programPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Dipali";
		String rev="";
		int length=s.length()-1;
		
		//System.out.println(length);
		
		for(int i=length; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);	
		
	}

}
