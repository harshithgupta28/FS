import java.util.Scanner;

public class patter4 {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);	
		
		int i = 1, j;
		
		System.out.print("Right Triangle Number Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Right Angled Triangle Number Pattern");
		
		while (i <= rows ) 
		{
			j = 1 ;
			
			while( j <= i ) 	
			{
				System.out.printf("%d ", i);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}