
import java.util.*;
class evenVsodd 
{
    public static void main(String args[])
    { 
         Scanner sc  = new Scanner(System.in);
     String a = sc.next();
     String[] arr = a.split("(,)");
     int arr1[] = new int[arr.length];
     int even = 0;
     int odd =0;
      
      for(int i = 0;i<arr.length;i++) 
      {
          arr1[i] = Integer.parseInt(arr[i]);
           if(arr1[i]%2==0)
            even = even+arr1[i];
            else 
            odd = odd+arr1[i];
      }
      if(even>odd)
        {
            System.out.print(even-odd);
        }
        else
        System.out.print(odd-even);
    
       }
}
