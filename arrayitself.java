
 import java.util.*;
 public class arrayitself{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int a[]=new int[n];
         int prod = 1;
         for(int i=0;i<=n-1;i++){
             a[i] = sc.nextInt();
             prod=prod* a[i];
         }
         for(int i=0;i<=n-1;i++){
             a[i]=prod/a[i];
           }
           System.out.println(Arrays.toString(a));
     }
 }2