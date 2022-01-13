/* Write a java program with the following Scenario

Create a function that takes a string and returns a new string with its 
first and last characters swapped, except under two conditions:

--> If the length of the string is less than two, return "Incompatible.".
--> If the first and last characters are the same, return "Two's a pair.".
Examples input\output
Cat, dog, and mouse.
.at, dog, and mouseC

ada
Two's a pair.

Ada
adA

z
Incompatible.

Notes
--> Testcases  are case sensitive (e.g. "A" and "a" are not the same character).
*/ 
import java.util.*;
class swapincompatiblepair{
    
     public static String swapincompatiblepairr(String s){
        char[] ch = s.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length-1];
        ch[ch.length-1] = temp;
            return String.valueOf(ch);
            
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(swapincompatiblepairr(s));
         if(s.length()<2){
            System.out.println("Incompatible");
            System.exit(0);}
        else if(s.charAt(0)==s.charAt(s.length()-1)){
          System.out.println("Two's a pair");
             }
         else
            System.out.println();
             
        }
   }