/* Write a Java program that returns true if two arrays have 
the same number of unique elements, and false otherwise.

To illustrate:

arr1 = [1, 3, 4, 4, 4]
arr2 = [2, 5, 7]
true //output
In arr1, the number 4 appears three times, 
which means it contains three unique elements: [1, 3, 4]. 
Since arr1 and arr2 both contain the same number of unique elements,
this example would return true.

Examples input/output
5
1 3 4 4 4
3
2 5 7
true

4
9 8 7 6
4
4 4 3 1
false

*/

import java.util.*;
class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> h=new HashSet<Integer>();
        HashSet<Integer> k=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            h.add(sc.nextInt());
        }
        int a=sc.nextInt();
        for(int j=0;j<a;j++)
        {
            k.add(sc.nextInt());
        }
        if(h.size()==k.size())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}