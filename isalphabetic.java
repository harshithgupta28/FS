/* Write a java program for the following scenario
Create a function that takes a string and returns true or false, 
depending on whether the characters are in order or not.

Examples 
input   output
abc --> true 

charan --> false

123 --> true

xyzz --> true
Notes
--> You don't have to handle empty strings.
*/  



 
 
import java.util.*;
 class isalphabetic
 {
     public static boolean isAlbhabeticc(String s)
     {
         int n = s.length();
         char c[] = new char[n];

         for (int i = 0;i<n;i++)
         {
            c[i]=s.charAt(i);
         }
         Arrays.sort(c);
         for (int i = 0; i < n; i++) {
             if(c[i]!=s.charAt(i))
             return false; 
            }
            return true;
             
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         if(isAlbhabeticc(str))
         {
             System.out.print("true");

         } 
         else
         {
             System.out.print("false");
         }
     }
 }