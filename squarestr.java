/* A string is called square if it is some string written twice in a row. 
For example, the strings "aa", "abcabc", "abab" and "baabaa" are square. 
But the strings "aaa", "abaaab" and "abcdabc" are not square.

For a given string s determine if it is square.

Input
The first line of input data contains an integer t (1≤t≤100) —the number of test cases.

This is followed by t lines, each containing a description of one test case. 
The given strings consist only of lowercase Latin letters and have lengths
between 1 and 100 inclusive.

Output
For each test case, output on a separate line:

YES if the string in the corresponding test case is square,
NO otherwise.

Example
input=10    //no of input strings
a
aa
aaa
aaaa
abab
abcabc
abacaba
xxyy
xyyx
xyxy

output=NO
YES
NO
YES
YES
YES
NO
NO
NO
YES
*/

import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] string = new String [sc.nextInt()];      
        sc.nextLine();   
        for (int i = 0; i < string.length; i++){
            string[i] = sc.nextLine();
        } 
        for(String str: string){
            int n = str.length();
            if(n %2 == 0){
                String s1 = str.substring(0, n/2);
                String s2 = str.substring(n/2);
                if(s1.equals(s2)== true){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else
                System.out.println("NO");
        }  
    }
}