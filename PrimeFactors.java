
import java.util.*;
public class PrimeFactor
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0,k=0;
	
		for(int i=2;i<=n;i++)
		{
		  while(n%i==0)
		  {
		      n=n/i;
		      System.out.print(i+" ");
		      i++;
		  
		  }
		}
		   
		
	}
}
