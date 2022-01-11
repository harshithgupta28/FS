/*
Aadhya is a java programmer and her trainer asked to write an efficient algorithm to 
implement the wrdwrd function in Java, which returns the index of the first occurrence of a 
string 'S' in another string 'X'.

case 1
input=charan
kmit
output=-1
explanation:
kmit is not present in the string charan as substring.

case 2
input=Techie Delight
light
output=9

explanation:
light is present as substring in Techie Delight from index 9 (0 based indexing).
*/
import java.util.*;
class substring
{
    // Function to implement `wrdwrd()` function
    public static void wrdwrd(String X, String Y)
    {
        if((X.contains(Y))){
           System.out.println(X.indexOf(Y));}
        else
           System.out.println("-1");
       
    }

 
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       
       String X=sc.nextLine();
       String Y=sc.nextLine();
       wrdwrd(X,Y);
    }
}