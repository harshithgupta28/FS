/*Write a java program to find if a given positive number is a Camel Case Number or Not

A number is said to be Camel Case Number if the First digit of the number is always greater than 
or equal to the digits which are right side to it and if a number contains a single digit it is 
always assumed it as a Camel Case.
If the given Number is Camel Case Print "Camel Case" else print "Not Camel Case"
If any negative number is given print "Not Camel Case"

sample 1:
input=543 
output=Camel Case

sample 2:
input=582 
output=Not Camel Case 

*/
import java.util.*;
public class CamelCaseNumber{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<0){
            System.out.println("Not Camel Case"); 
            System.exit(0);
        }
        int r,max;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> revarr=new ArrayList<Integer>();
        while(n>0){
            r=n%10;
            arr.add(r);
            n=n/10;
        }
       for(int i=arr.size()-1;i>=0;i--){
           revarr.add(arr.get(i));
       }
     
      max=Collections.max(revarr);
      
      if(max==revarr.get(0)){
          System.out.println("Camel Case");
      }
      else{
          System.out.println("Not Camel Case");
      }
    }
}