/*Given two string arrays word1 and word2, return true if the two arrays represent 
the same string,and false otherwise.

A string is represented by an array if the array elements concatenated in order 
forms the string.

Example 1:
if Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false



Tescase would be like this
input=2         //group size 
ab  
c   // first group
a  
bc   // 2nd group elements 
output=true


Note: please do follow Testcase format for input and output


*/

import java.util.*;
class samestringRnot
{
	public static boolean check(String X, String Y)
	{
		if(X.equals(Y)) return true;
		return false;
	}
	
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        String s1="",s2="";
        for(int i=0;i<in;i++) s1 += sc.next();
        for(int i=0;i<in;i++) s2 += sc.next();
        if(check(s1,s2)) System.out.println("true");
        else System.out.println("false");
    }
}