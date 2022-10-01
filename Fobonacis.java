
public class Fobonacis {

	public static void main(String[] args) {
		int n=0;
		int n1=1;
		int n2;
		int n3=5;
		System.out.println(n+" "+ n1);
		//System.out.println(n2);
		for(int i=2; i<n3; i++) {
			 n2=n+n1;
			
			System.out.println(n2);
			n=n1;
			n1=n2;
		}
			
	}

}
