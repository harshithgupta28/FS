/* Write a java program that check whether given date is valid or not?

simple input/output:
24092017        //input in DDMMYYYY format
valid

54142017
invalid
*/
import java.util.*;
class validdate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = s.substring(0,2);
        String b = s.substring(2,4);
        
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        
        if(x<1 || x>31 || y<1 || y>12){
            System.out.println("invalid");
        }
        else{
            System.out.println("valid");
        }
    }
}