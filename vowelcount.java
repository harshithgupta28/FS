/* Write a Java program that returns the first n vowels of a string.

Examples
sharpening skills           //input string  
3                           //input
aei                         //output

major league
5
aoeau

hostess
5
invalid

Notes
Return "invalid" if the n exceeds the number of vowels in a string.
*/
import java.util.*;
class vowelcount{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        int count =1;
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        for(int i =0;i<s.length();i++)
        {
            if(count<=n)

            {
                if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||  s.charAt(i) == 'i'||  s.charAt(i) == 'o' || s.charAt(i) =='u')
            {
                sb.append(s.charAt(i));
                count++;
            }
            else{
                continue;
            }
            }
            else{
                break;
            }
        }
        if(count<n){
            System.out.println("invalid");
        }
       else{
            System.out.println(sb);
       } 
    }
    
}
