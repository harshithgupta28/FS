/*
A string is called square if it is some string written twice in a row. 
For example, the strings "aa", "abcabc", "abab" and "baabaa" are square.
But the strings "aaa", "abaaab" and "abcdabc" are not square.

For a given string s determine if it is square.

1st line indicates input and second line indicates output
Example:
a
NO

aa
YES

abab
YES

abcabc
YES

abacaba
NO


*/  
import java.util.*;
 
class stringsquare {
     
    static boolean isPerfectSquareString(String str)
    {
        int sum = 0;
       
        int len = str.length();
      
        for (int i = 0; i < len; i++)
            sum += (int)str.charAt(i);
         
        long squareRoot = (long)Math.sqrt(sum);
           return ((squareRoot -
                Math.floor(squareRoot)) == 0);
    }
 
   
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
     
        if (isPerfectSquareString(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
 

