/*Write a  java program for the following scenario
Create a function that takes an array and returns the difference between 
the biggest and smallest numbers.

Examples
10,4,1,4,-10,-50,32,21
82
// Smallest number is -50, biggest is 32.  so 32 - -50 ->82

44,32,86,19
67
// Smallest number is 19, biggest is 86. so 86-19 -> 67

Constrainsts:
-input is a string and output is a integer value
-input group contains intergers 
*/ 
import java.util.*;
class arradiff
{  
     public static void main(String args[])
 {
     Scanner sc  = new Scanner(System.in);
     String a = sc.next();
     String[] arr = a.split(",");
     int arr1[] = new int[arr.length];
    
       for(int i = 0;i<arr.length;i++)
    { 
        arr1[i] = Integer.parseInt(arr[i]);
        
    }
     Arrays.sort(arr1);
   
      System.out.print(arr1[arr.length-1] - arr1[0]);
}
    
}