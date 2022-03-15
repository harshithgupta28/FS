/* Write a java program 
to Create a function that takes an integer and returns the factorial of
that integer recursively. 

Factorial is the integer multiplied by all positive lower integers.


Sample input/output
3
6

5
120
*/
import java.util.*;

 class factrecur {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        long factorial = Numbers(num);
        System.out.println(factorial);
    }
    public static long Numbers(int num)
    {
        if (num >= 1)
            return num * Numbers(num - 1);
        else
            return 1;
    }
}
