/* Write a program to find the four digited number is prfect square or not, 
and all the digits in that number are even.

Note: consider 0  as a even digit

Sample input/output:
6084
true

6400
true


6466
false

4626
false

*/ 

import java.util.*;
class evenprftsqr
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double n= sc.nextFloat();
        double a = Math.sqrt(n);
        String str = Double.toString(a);
        if(n%2==0)
        {
            if(str.endsWith("0"))
            System.out.print("true");
            else
            System.out.print("false");
        }
        else if (str.contains ("1")||str.contains ("3")||str.contains ("5")||str.contains ("7")||str.contains ("9"))
        {System.out.print("false");}
        else{
        System.out.print("false");}
        
        
        
    }
}