/*
Write a program to check if a given number is COMPLETE NUMBER or NOT

A Number is said to be COMPLETE NUMBER if the individual digits of the number are all even 
if the individual digits of the number are not even then print NOT COMPLETE NUMBER 

Assume 0 as a Even Number

input = 486 
output = COMPLETE NUMBER

input = 135
output = NOT COMPLETE NUMBER

input = 100
output = NOT COMPLETE NUMBER

Note: Create a class Mmath and a method isEven( int n) to find each ditit is a even or not  

*/
import java.util.*;
class CompleteNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rem =0;
        //int arr [] = new int[50];
        int i =0,check =0;
        // sample no 214
        // int arr[50];(c++ lo)
        while(n>0)
        {
            rem = n%10;
            if(rem%2==1) 
            check =1;
            //arr[i++] = rem;
            n = n/10;
        } 
        
        if (check== 0)
        {
            System.out.print("COMPLETE NUMBER"); 
        }
        else {
            System.out.print("NOT COMPLETE NUMBER");
        }
    }
}