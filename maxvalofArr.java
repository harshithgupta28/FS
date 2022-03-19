/* Write a java program for Given the array of integers n, 
you will choose two different indices i and j of that array. 
Return the maximum value of (n[i]-1)*(n[j]-1).


Example input/output:
4          //sizeof an array
3 4 5 2     // array elements
12       //output

4
1 5 4 5
16
*/
import java.util.*;
public class maxvalofArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
         int arr[] = new int[n];
         int pro = 0;
         int finalr  = 0;
         for(int i = 0;i<n;i++)
         {
             arr[i]  = sc.nextInt();
         }
         for(int j = 0;j<n;j++)
             {
                 for(int k = j+1;k<n;k++)
                 {
                    pro = (arr[j]-1)*(arr[k]-1);
                    if(finalr< pro)
                    finalr = pro;
                 }
                
             }
         
            System.out.print(finalr);
        
}
    
}
