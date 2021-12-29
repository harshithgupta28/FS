/* Write a java program to find given number is perfect power or not

Given a positive integer which fits in a 32 bit signed integer,
find if it can be expressed as A^P where 10 > P > 1 and A > 0. 
A and P both should be integers.

Sample input/output
input=125
output=True  

explanation
as 5^3 = 125. 

input=5
output=False

*/

import java.util.*;
class PerfectPower
{
  public static void main(String args[])
  {
     Scanner sc =new Scanner(System.in);
     int n = sc.nextInt();
      int count =0;
      for(int i =1;i<=n/2;i++)
      {
          
          if(i*i==n||i*i*i==n)
          count = 1;
          
      }
      if (count==1)
      {
          System.out.print("True");
      }
      else 
      System.out.print("False");
      
      
      
  }
}