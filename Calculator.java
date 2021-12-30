/* Write a java program with following scenario
Takes two numbers and a mathematical operator + - / * and 
perform a calculation with the given numbers and return the output.

Example sample input outputs
inputs       outputs
4 
'+' 
4           ---> 8

3 
'*' 
2           ---> 6

6 
'/'
2           ---> 3

Notes
take the inputs and in same sequence (integer , operator, integer)
If the input tries to divide by 0, return 0.

*/ 
import java.util.Scanner;
class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        int ans;
       
        switch(op){public class Calculator {
            
        }
        
            case '+' : ans = a + b;
            break;
            case '-': ans =a-b;
            break;
            case '/': if(b>0)ans =a/b; 
            else ans =0;
            break;
            case '*':ans = a*b;
            break;
            
            default:
            return;
            }
            System.out.print( ans);
        
       
        }
    }    
