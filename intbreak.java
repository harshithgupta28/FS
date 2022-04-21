/* Write a java program for following scenario
Given a positive integer n, break it into the sum of at least two positive integers 
and maximize the product of those integers. Return the maximum product you can get.


Sample input/output

2 ----> 1
Explanation: 2 = 1 + 1, 1 × 1 = 1.


10  -----> 36
Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.


Note: You may assume that n is not less than 2 and not larger than 58.

*/

import java.util.*;
class intbreak {
    public static int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
       
        int result = 0;
        for (int i = 2 ; i < n ; i++) {
            int val = n/i;
            int remainder = n%i;
        
            int product = ((int)Math.pow(val+1, remainder)) * ((int) Math.pow(val, i-remainder));
            result = Math.max(result, product);
        }
        return result;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(integerBreak(n));
    }
}