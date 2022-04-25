/* A number n is automorphic if n^2 ends in n.

For example: n=5, n^2=25

Create a Java Program that takes a number and
returns true if the number is automorphic, false if it isn't.

Examples
5
true

8
false

76
true

*/
import java.util.*;
class automorphic 
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n*n;
        String str = Integer.toString(n);
        String str2 = Integer.toString(m);
        
        int size = str2.length();
        int size2 = str.length();
        int whole  = size-size2;
        
        String tot = str2.substring(whole);
        //System.out.print(str2.substring(whole));
        
        
        if(str.equals(tot))
        System.out.print("true");
        else
        System.out.print("false");
        
    }
}