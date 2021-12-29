/* Write a java program to check if a given positive number is a strong number. 
A strong number is a number whose sum of factorial of each digit is the number itself. 
Print 1 if it is strong number, else 0.

Note: Create a new class and method(Factorial) to find the factorial of a number

example: 145
1! + 4! + 5! = 1+24+120 = 145

Sample:
Input=145
output=1

Input=128
output=0

*/
 
import java.util.*;
 
class StrongNumber{
    
    public static int factorial(int n)
    {
        int fact =1;
        for(int i = n;i>=1;i--){
        fact = fact*i;
        }
        return fact;
        
    }
    
        
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int r,sum=0;
         int temp = n;
         while (n>0){
             r=n%10;
             int ans = factorial(r);
             sum = sum+ans;
             n = n/10; 
         }
         if (temp == sum)
         {
             System.out.print("1");
         }
         else{
             System.out.print("0");
         }
         
   
    }
}
