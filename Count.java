import java.util.HashMap;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ranjan singh Ranjan Singh i is good person";
		HashMap<String,Integer > s1=new HashMap<>();
		String[] sp=s.split(",");
		for(int i=0; i<sp.length;i++)
		{
			 if (s1.containsKey(sp[i])) {
	                int count = s1.get(sp[i]);
	                s1.put(sp[i], count+1);
	            }
			 else {
				 s1.put(sp[i], 1);
			 }
		}
		System.out.println(s1);
	
	}

}
