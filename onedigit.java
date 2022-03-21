/* Write a java program that takes a number and returns one digit that
is the result of summing all the digits of the input number. 
When the sum of the digits consists of more than one digit, 
repeat summing until you get one digit.

Examples
123
6
// 1 + 2 + 3 = 6

999888777
9

1238763636555555555
9
*/// sum becomes single digit.
import java.util.*;
 
public class onedigit {
     
    static int digSum(long n)
    {
        int sum = 0;
 
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
     
   public static void main(String argc[])
    {
        Scanner sc = new Scanner(System.in);
        
        long  n = sc.nextLong();
        System.out.println(digSum(n));
    }
}
 
