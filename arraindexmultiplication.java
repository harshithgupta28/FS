/*Cristy  got a maths assignment  please help her by developing java programs for her. 

Assignment is: 
she will get count of numbers as well numbers. 
she needs to  sum all the numbers,where each number is multiplied by its index (zero-based).

for Example
5           //count
1 2 3 4 5
40          // output

Explanation:(1*0 + 2*1 + 3*2 + 4*3 + 5*4)= 40 so returned 40

4           //count
-3, 0, 8, -6
-2
Explanation: (-3*0 + 0*1 + 8*2 + -6*3) =-2 so returned -2
*/ 
import java.util.*;
class arraindexmultiplication
{
    public static void main(String args[])
    {


        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++)
        {
            arr[i] =sc.nextInt();
            sum = sum+arr[i]*i;
        }
        System.out.print(sum);
        
        // int ans = sumofindex(n);
        // System.out.print(ans);
        
    }
    // static int sumofindex(int[] ar)
    // {
    //     int sum = 0;
        
    //     int[] arr = new int[];
    //     //int n = arr.length;
    //     for(int i = 0;i<arr.length();i++)
    //     {
    //         sum = arr[i]*i;
    //     }
    //  return sum;   
    // }
    // //sum+Ar[i]*i
    
}