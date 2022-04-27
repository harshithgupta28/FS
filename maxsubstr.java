/* Write a java program that  return maximum sub string 


str     //input
alpha
theta 

str is the source string and have to which starts with alpha and
ends  with theta.

Sample input/output:

Keshav memorial Institute of Technology and science
a
o
av memorial Institute of Technolo           //output

*/
 
import java.util.*;
class maxsubstr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(s.substring(s.indexOf(a),s.lastIndexOf(b)+1));
    }
}