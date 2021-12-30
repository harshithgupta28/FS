/* Write a java program that takes two arguments: the original price and the discount percentage 
as integers and returns the final price after the discount (Integer).

Alternative Text

Examples sample
input       output
1500
50      ---> 750

89
20      ---> 71

100
75      ---> 25


*/
import java.util.*;
class Discount
{
    public static void main(String args[])
    {
        double price,s,discount;
        int tp;
        Scanner sc = new Scanner (System.in);
         price = sc.nextDouble();
         
         discount = sc.nextDouble();
        s = 100-discount;
        tp = (int) ((s*price)/100);
        System.out.print(tp);
    }
}