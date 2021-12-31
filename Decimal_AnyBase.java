/*Write a Java program to perform Decimal to any base Conversion.

Read two integers, First integer indicates decimal value and 
second integer indicates base. After conversion print the output.

Note: If base<=0 or base>=9 print -1.

Sample 1:
input=10
2
output=1010

Sample 2:
input=100
5
output=400
*/import java.lang.*;
import java.io.*;
import java.util.*;
 
class Decimal_AnyBase
{
     

static char reVal(int num)
{
    if (num >= 0 && num <= 9)
        return (char)(num + 48);
    else
        return (char)(num - 10 + 65);
}
 

static String fromDeci(int base1, int inputNum)
{
    String s = "";
 
    
    while (inputNum > 0)
    {
        s += reVal(inputNum % base1);
        inputNum /= base1;
    }
    StringBuilder ix = new StringBuilder();
 
        
        ix.append(s);
 
   
    return new String(ix.reverse());
}
 

public static void main (String[] args)
{
    Scanner s=new Scanner(System.in);
    int inputNum=s.nextInt();
    int base1=s.nextInt();
    if(base1<=0 || base1>=9){
        System.out.println("-1");
    }
    else{
    System.out.println(fromDeci(base1, inputNum));
    }
}
}