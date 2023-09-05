package programPractice;

public class RemoveAlphaFromString {

	public static void main(String[] args) {


		String s = "di12pa23li45";
		String numstring = "";
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				numstring = numstring+s.charAt(i);
			}
		}
		System.out.println(numstring);

	}

}
