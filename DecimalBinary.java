/*Write a Java Program to Convert a decimal number into its 
binary representation.

Example:
Input: 5
Output: 101
 
Input: 12
Output: 1100
*/

import java.util.*;
class DecimalBinary {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);45
        int a=sc.nextInt();
        System.out.print(Integer.toBinaryString(a));
    }
    
} 