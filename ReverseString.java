
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ranjan Singh";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch=s.charAt(i);
			System.out.print(ch);
		}

	}

}
