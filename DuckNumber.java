/*Write a Java program to check whether a number is a Duck Number or not.

A Duck number is a number which has zeroes present in it, 
but there should be no zero present in the beginning of the number.

Sample
input=3210
output=true

input=0234
output=false

input=1234
output=false

*/ 
import java.util.*;
class DuckNumber
{
    public static boolean checknu(int n)
    {
        //int rem=0;
        while(n > 0)
        {
            if(n%10 == 0)
            return true;
            n=n/10;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int one = sc.nextInt();
        System.out.println(checknu(one));
        /*
        if(checknu(one))
        {
            System.out.print("true");
        }
        else
        System.out.print("flase");
    }*/
}
}