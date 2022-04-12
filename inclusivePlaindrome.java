/* /* Write a java program that gives the number of palindrome numbers
in a specified range (inclusive).

For example, between 8 and 34,
there are 5 palindromes: 8, 9, 11, 22 and 33. 
Between 1550 and 1552 there is exactly one palindrome: 1551.

Examples
1  10   //input
9       //output

555 556 
1

878 898
3
Notes
Single-digit numbers are trivially palindrome numbers.

*/

import java.util.*;
class Test
{
    static int isPalindrome(int n)
    {
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
             
        
        return(n == rev)? 1 : 0;
    }
     
    static void countPal(int min, int max)
    {
        int count = 0;
        for (int i = min; i <= max; i++)
            if (isPalindrome(i)==1)
                count++;
                System.out.print(count);
    }
     
   
     public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         countPal(a,b);
    }
}
 