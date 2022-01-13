/* Write a java program for the following scenario

Create a function that takes a string's characters as ASCII and returns 
each character's hexadecimal value as a string.

Examples
hello world
68 65 6c 6c 6f 20 77 6f 72 6c 64

Big Boi
42 69 67 20 42 6f 69

Marty Poppinson
4d 61 72 74 79 20 50 6f 70 70 69 6e 73 6f 6e

Notes
-->Each byte must be seperated by a space.
-->All alpha hex characters must be lowercase.

*/import java.util.*;
public class asciihexa{
	public static String converttohexa(String s)
	{
		String hexa = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int in = (int)ch;
			String total = Integer.toHexString(in);
			hexa = hexa + "  " +total;
		}
		return hexa;
	}
         public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
		System.out.println(converttohexa(s));
	}
}