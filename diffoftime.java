/* Write a program to accept two time stamps in the given format 
HH:MM:SS using apropriate datatypes and find the difference 
between the time stamps in seconds.

Sample input/output:
01:00:20 
02:00:30

3610    //output

*/
 
import java.util.*;
class diffoftime
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
         String[] strr = str.split(":");
        String str2 = sc.nextLine();
       String[] strr2 = str2.split(":");
       int arra[] = new int[3];
       for(int i=0;i<3;i++)
       {
           arra[i] = Integer.parseInt(strr[i]);
       }
       int arrb[] = new int[3];
       for(int i=0;i<3;i++)
       {
           arrb[i] = Integer.parseInt(strr2[i]);
       }
       int x = (arra[0]*3600+arra[1]*60+arra[2]);
       int y = (arrb[0]*3600+arrb[1]*60+arrb[2]);
       int z = Math.abs(x-y);
       System.out.print(z);
     
       
       
    }
}