/*  Write a java program for following scenario

For a given a integer (3 -7) read a triangle array,  
return the minimum path sum from top to bottom.

in= 4    //hight    (3 -7)
   2
  3 4
 6 5 7
4 1 8 3    // you have to read the  array elements  where hight is 4

output=11

The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).


*/ 
import java.util.*;
class Test
{
  static int min(int in[][], int n)
  {
    for(int i=n-2;i>=0;i--)
    {
      for(int j=0;j<=i;j++)
      {
        if(in[i+1][j] < in[i+1][j+1])
          in[i][j] += in[i+1][j];
        else
          in[i][j] += in[i+1][j+1];
      }
    }
    return in[0][0];
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); 
      int in[][] = new int[n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<=i;j++)
              in[i][j] = sc.nextInt();
      }
      int answer = min(in, n);
      System.out.print(answer);
  }
}
