/*Write a Java program to print following pattern

input=6
output=
o
oo
o o
o  o
o   o
oooooo

*/  

import java.util.*;
public class pattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
        while(i<=n)
        {
            int j =1;
            while(j<=i)
            {
                if(i==1||i==n||j==1)
                System.out.print("o");
                else if(i==j)
                System.out.print("o");
                else
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}

