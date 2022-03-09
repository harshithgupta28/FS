// The municipal corporation of hyd is planning to conduct a voting survey, 
// they are getting confused with the common names in the given list. 
// The concerned officer finds the few characters of the names same and removes them. 
// Help the officer to find the same characters that begin with the same name

// The first line of input contains the number of voters names followed by voters names

// If no such thing exists print -1

// input = 3
// apple ape april
// output = ap


// input = 4
// abhishake abhignya abhinayni abhiram
// output=abhi
import java.util.*;
public class commen_name {
    public static String common_name(String ab,int n)
    {
        String same;
        for(int i = 0;i<n;i++)
        {
            if(ab==ab)
            same += ab;
        }
        return same;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String>st = new ArrayList();
        for(int i=0;i<n;i++)
        {
            st.add(sc.next());
        }

            common_name(st,n);
    }
    
}
