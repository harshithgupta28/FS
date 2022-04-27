/* Write a java program which adds spaces before every capital in a word. 
Uncapitalize the whole string afterwards.

Examples input/output
helloWorld
hello world

iLoveMyTeapot
i love my teapot

stayIndoors
stay indoors
Notes
The first letter will stay uncapitalized.*/
// Java program to put spaces between words starting
// with capital letters.


import java.util.*;

class addspaces
{
	public static void addspace(String strr)
	{
		char[] str=strr.toCharArray();
		
		for (int i=0; i < str.length; i++)
		{
			if (str[i]>='A' && str[i]<='Z')
			{
				str[i] = (char)(str[i]+32);
			
				if (i != 0)
					System.out.print(" ");
	
				System.out.print(str[i]);
			}
	
			else
			System.out.print(str[i]);
		}
	}	
	
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		addspace(str);
	}
}
