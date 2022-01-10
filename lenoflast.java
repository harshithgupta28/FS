
import java.util.*;
class lenoflast
{
    public static int lengthoflastword( final String a)
    {
        int len =0;
        String z = a.trim();
        for(int i = 0 ;i<z.length();i++)
        {
            if(z.charAt(i) == ' ')
            len =0;
            else
            len++;
        }
        return len;
    }
    
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(lengthoflastword(str));
    }
}