/* Please  implement a Java program  For following scenario 

-- for given size and group of elements 
-- Increment Every Element of the group by One 
-- Print Incremented group in sorted order.

Sample Input & Output:
input=5     //size
2           //  5 elements  2-9
5
8
6
9
output=[3, 6, 7, 9, 10]
*/ 

import java.util.*;
class Array_increment
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            arr[i] = arr[i]+1;
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        //System.out.print(incerement(n));
        
    }
    // static void incerement(int[] aa)
    // {
    //     int m = aa.length();
    //     for(int i=0;i<m;i++)
    //     {
    //         aa[i] = aa[i]+1;
    //     }
    //     Arrays.sort(aa);
        
    //     int mm = Arrays.toString(aa);
        
    //     return mm;
    // }
}