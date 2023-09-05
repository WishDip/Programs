package programPractice;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String s="My_name is Dipali";
		String [] splitvalue = s.split(" ");
		
		int size = splitvalue.length-1;
		// System.out.println(size);
		
		for(int i=size; i>=0; i--)
		{
			System.out.print(splitvalue[i]+" ");
		}
				

	}

}
