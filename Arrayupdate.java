// Write a Java Program to Insert an Element in a Specified Position in a Given Array
/*
Scenario is : 
input=
Enter no. of elements you want in array:6
Enter all the elements:
2
4 
6
9
4
5
Enter the position where you want to insert element:3
Enter the element you want to insert:7
output=[2, 4, 7, 6, 9, 4, 5]

sample testcase

input=6         // size 
2
4
6
9
4
5
3           //position
7           // element 
output=[2, 4, 7, 6, 9, 4, 5]

*/

// import java.util.*;
// public class Test 
// {
//     public static void main(String[] args) 
//     {
//       Scanner sc =  new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         for(int i =0;i<n;i++)
        
//           arr[i] = sc.nextInt();
        
//         int pos = sc.nextInt();
//         int ele = sc.nextInt();
//       for (int i = 0;i<n;i++)
//       {
//           if(i==pos-1)
//           System.out.print(ele);
//           System.out.print(arr[i]);
//       }
         
//     }
// }


import java.util.Scanner;
public class Arrayupdate 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int [] arr = new int[in];
        for(int i=0;i<in;i++)
            arr[i] = sc.nextInt();
        int pos =sc.nextInt();
        int ele = sc.nextInt();
        for(int i=0;i<in;i++){
            if(i==pos-1) System.out.println(ele);
            System.out.println(arr[i]);    
        }
    }
}
