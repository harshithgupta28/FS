/* Write a function that returns the length of a string. 
Make your function recursive.
*/
/*sample input/output:
apple    
5

make
4

Keshav Memorial Institute of Technology
39
*/
import java.util.*;
class stringlenrecursive{
    public static int recursivestr(char a[], int i){
        if(a[i]=='\0'){
            return 0;
        }
        return 1+recursivestr(a,i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str+='\0';
        char a[]= str.toCharArray();
        System.out.println(recursivestr(a, 0));
    }
}