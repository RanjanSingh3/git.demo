import java.util.Scanner;

public class Iterator {

	public static void main(String[] args) {
		int n=3;
		int temp=0;
		for(int i=2; i<=n-1; i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
				break;
				
			}
		}
		
		if(temp>0)
		{
			System.out.println(" not  prime");
		}
		else
			System.out.println("prime ");
	}

}
