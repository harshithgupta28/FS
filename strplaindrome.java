/* write a Java Program to Check whether a String is a Palindrome

input=   aba
output= ture

input= abc
output= false 

*/ 
import java.util.*;
class strplaindrome{
    
    static boolean isplaindrome(String str)
    {
        int i=0;
        int j = str.length()-1;
        
        while (i<j )
        {
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str =sc.nextLine();
        if(isplaindrome(str))
        
            System.out.print("ture");
        
        else
            System.out.print("false");
        
    }
}