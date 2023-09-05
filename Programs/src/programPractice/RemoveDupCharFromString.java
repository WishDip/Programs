package programPractice;

public class RemoveDupCharFromString {

	public static void main(String[] args) {


		String s1="mnomno";
		String s2="";
		
		for(int i=0; i<s1.length(); i++)
		{
			boolean found = false;
			for(int j=0; j<s2.length(); j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					found = true;
					break;
				}
				
			}
			if(found==false)
			{
			s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
