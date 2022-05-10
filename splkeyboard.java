/*In an institution there is a special keyboard.
It contains only one row of 26-keys, keys[]

The order of keys will be given, You need to findout the time taken to type a word.

The rules to find the time is as follows:
Initially you will be at first key .i.e, keys[0].
To type a character, you have to move to a key having desired character, key[j].
Time taken to type the character from key at ith index to key at jth index is |i - j|.

NOTE: You have to use only one finger to type the word.


Input: keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba"
Output: 4
Explanation: The index moves from 0 to 2 to write 'c' then to 1 to write 'b' then to 0 again to write 'a'.
Total time = 2 + 1 + 1 = 4. 

Sample Input :
--------------
pqrstuvwxyzabcdefghijklmno
kmit
Sample Output :
---------------
42*/


// Java program for the above approach

import java.util.*;

class splkeyboard {

static void timeTakenToType(String keyboardLayout,
							String word)
{
	int[] pos = new int[26];

	for (int i = 0; i < 26; i++) {

	char ch = keyboardLayout.charAt(i);
	pos[ch - 'a'] = i;
	}

	int last = 0;

	int result = 0;

	for (int i = 0; i < word.length(); i++) {
	char ch = word.charAt(i);

	int destination = pos[ch - 'a'];

	int distance = Math.abs(destination - last);

	result += distance;

	last = destination;
	}

	System.out.println(result);
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
	String keyboardLayout	= sc.nextLine();

	String word = sc.nextLine();

	timeTakenToType(keyboardLayout, word);
}
}

