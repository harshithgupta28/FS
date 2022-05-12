/*Given a string S in encoded form, and  an integer array indices[] of string length.

You need to find the decoded form of String S, 
by moving each character at ith position in S, to indices[i] position in decoded string.
and then print the decoded string.

Input Format:
-------------
Line-1 -> A String S, enocded string of length L
Line-2 -> L space separated integers indices[], where 0 <=indices[i] < L 

Output Format:
--------------
Print a String, decoded string.


Sample Input-1:
---------------
aeilmmor
6 1 5 7 2 0 3 4
Sample Output-1:
----------------
memorial

Explanation:
---------------
Given String, aeilmmor
6 1 5 7 2 0 3 4
after shifting,	memorial


Sample Input-2:
---------------
aidin
4 3 2 0 1
Sample Output-2:
----------------
india

Explanation-2:
---------------
Given String, aidin
4 3 2 0 1
after shifting,	india */


import java.util.*;
class stringcode
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =sc.nextLine();
        String[] str = sc.nextLine().split("");
        int arr[] = new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        char c[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            c[arr[i]] = s.charAt(i);
        }
        String ans = new String(c);
        System.out.print(ans);
    }
}
