/*
In a colony drinking water is supplied through water tanks.
There is a big queue of N buckets, He need to fill all the N buckets in the queue.
The supplier can fill one bucket or two buckets at a time.

Print the number of distinct ways he can fill all the buckets.

Input Format:
-------------
An integer N, number of buckets in the queue.

Output Format:
--------------
Print the number of ways to fill all the buckets.


Sample Input-1:
---------------
2

Sample Output-1:
----------------
2

Explanation:
------------
There are two ways to fill the buckets.
1. 1 bucket + 1 bucket
2. 2 buckets


Sample Input-2:
---------------
4

Sample Output-2:
----------------
5

Explanation:
------------
There are five ways to fill the buckets.
1. 1 bucket + 1 bucket + 1 bucket + 1 bucket
2. 1 bucket + 1 bucket + 2 buckets 
3. 1 bucket + 2 buckets + 1 bucket
4. 2 buckets + 1 bucket + 1 bucket
5. 2 buckets + 2 buckets

*/
import java.util.*;
class noofbuckets
{

	static void multiply(int F[][], int M[][])
	{
		int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
		int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
		int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
		int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
	}

	static void power(int F[][], int n)
	{
		if (n == 0 || n == 1)
		{
			return;
		}
		int M[][] = {{1, 1}, {1, 0}};

		power(F, n / 2);
		multiply(F, F);

		if (n % 2 != 0)
		{
			multiply(F, M);
		}
	}

	static int countWays(int n)
	{
		int F[][] = {{1, 1}, {1, 0}};
		if (n == 0)
		{
			return 0;
		}
		power(F, n);
		return F[0][0];
	}
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countWays(n));
	}
}