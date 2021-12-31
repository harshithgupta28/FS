
/*import java.util.*;
public class PrimeFactors
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
}*/ 
import java.util.*; 
import java.lang.Math;
class Mmath{
    public static int isPrime(int n){
        boolean var=false;
        for (int i = 2; i <= n; i++) {
			if (n % i == 0){
			    var=true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						var= false;
						break;
					}
				}
				if (var) {
					System.out.print(i+" ");
				}
			}
        
    }
    return 0;
    }
}
class PrimeFactors{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Mmath s=new Mmath();
        s.isPrime(a);
    }
    
    
}
