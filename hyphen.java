
/*
Implement the following function
String moveHyphen (String str, int n) ;

The function accepts a string “str” of length ‘n’, that contains alphabets and 
hyphens (-). Implement the function to move all hyphens(-) in the string to the 
front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare
*/
import java.util.*;
public class hyphen {
    public static String movehyphen(String str)
    {
        if(str==null)
        return null;
    char[] ch = str.toCharArray();
    String hyphen = "";
    for(int i = 0;i<ch.length;i++)
    {
        if(ch[i]=='-')
        hyphen += "-";
    }
    str = str.replace("-","");
    return hyphen+str;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(movehyphen(str));

        
    }
    
}
