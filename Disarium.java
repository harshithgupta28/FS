/*Write a Program in Java to check whether given number is a Disarium Number or not.

Disarium Number: A number is called Disarium if sum of its digits powered with their 
respective positions is equal to the number itself.

For example 135 is a DISARIUM
(Workings 1^1+3^2+5^3 = 135)

Sample :
Input= 135
Output= Yes 

Input=80
Output=No
*/
import java.util.*;
public class Disarium 
{  
    
    public static int calculateLength(int n){  
        int length = 0;  
        while(n != 0){  
            length = length + 1;  
            n = n/10;  
        }  
        return length;  
    }  
      
    public static void main(String[] args) {  
        
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, rem = 0, n;  
        int len = calculateLength(num);  
    
        n = num;  
       
       while(num > 0){  
            rem = num%10;  
            sum = sum + (int)Math.pow(rem,len);  
            num = num/10;  
            len--;  
        }  
          
      
        if(sum == n)  
            System.out.println("Yes");  
        else  
            System.out.println("No");  
    }  
}  


