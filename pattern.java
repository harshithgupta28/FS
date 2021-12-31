/* Write a Java program to print following pattern

input=5
output=
 ####
# ###
## ##
### #
####

*/  
import java.util.*;

class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}


