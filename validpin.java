/* Wrie a Java program  that will test if a string is a valid PIN or not 
A valid PIN has:

Exactly 4 or 6 characters.
Only numeric characters (0-9).
No whitespace.
Examples input/ouptu
121317
true


45135
false

Note: use nextLine method
*/
import java.util.*;
class validpin{
    public static boolean isValidpin(String str)
    {
        
        if(str.length()==4 || str.length()==6){
            for(int i=0 ; i<str.length() ; i++){
                if(str.charAt(i)==' '){
            return false;
                
                }
                else if(str.matches("[0-9]+")){
             return true;
                }
            }
        }
      return false;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(isValidpin(str));
    }
}
    
   