/* Write a java program with the following scenario -

- You are given a string s of even length. Split this string into two halves of equal lengths,
and let a be the first half and b be the second half.

- Two strings are alike if they have the same number of consonants
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

Example 1:
Input: book
Output: true
Explanation: a = "bo" and b = "ok". a has 1 consonant and b has 1 consonant. 
Therefore, they are alike.

Example 2:
Input: textbook
Output: false
Explanation: a = "text" and b = "book". a has 3 consonants and b has 2 consonants. 
Therefore, they are not alike.

Constraints:
=> 2 <= s.length <= 100
=> s.length is even.
=> s consists of uppercase and lowercase letters.
*/ 
import java.util.*;
class consonantsplit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        
        String str = sc.nextLine();
        System.out.print(consta(str));
        
    }
    static boolean consta(String str)
    {
        int count = 0;
        int num = 0;
      
        char[] b = str.toCharArray();
          int n = str.length();
         for(int i = 0,j=n/2;i<n/2&&j<n;i++,j++)
        {
              if(!(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U'))
           
             count++;
              if(!(b[j]=='a'||b[j]=='e'||b[j]=='i'||b[j]=='o'||b[j]=='u'||b[j]=='A'||b[j]=='E'||b[j]=='I'||b[j]=='O'||b[j]=='U'))
             num++;
        }
        
        //int m = n-1/2;
        //  for(int i = n/2;i<n;i++)
        // {
             
        //      
        // }

     return count==num;
    }
}