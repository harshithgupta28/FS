/*
Given a string S(input consisting) of ‘@’ and ‘#’. The length of the string is 
variable. The task is to find the minimum number of ‘@’ or ‘#’ to make
it a valid string. The string is considered valid if the number of ‘@’ 
and ‘#’ are equal. The ‘@’ and ‘#’ can be at any position in the string.

 

Note : The output will be a positive or negative integer based on number 
of ‘@’ and ‘#’ in the input string.

(@>#): positive integer
(#>@): negative integer
(#=@): 0

case=1
input=b#y#e@kmi@t@#k###cd#
output=-4
case=2
input=he#@##llo@@
output=
0
case=3
input=charan@@@@singh###
output=1

*/ 
import java.util.*;
class positivestr
{
   
       public static void main(String[] args) {
           Scanner in = new Scanner(System.in);

           String str = in.nextLine();
        //    int n = str.length();
           int count = 0;
           int count2 = 0;
           for (int i = 0; i < str.length(); i++) {
               
            char a = str.charAt(i);
              if(a == '#' )
              {
                 count++;
              }
              else if(a == '@')
              count2++;
          }
          
// (@>#): positive integer
// (#>@): negative integer
// (#=@): 0
          if(count>count2)
          {
              System.out.print(count2-count);
          }
          else if( count2>count)
          {
              System.out.print(count2-count);
          }else if(count == count2)
          {
              System.out.print("0");
          }
       }
   }

 