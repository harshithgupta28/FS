/* Write a java program that takes an integer columnNumber, return its corresponding 
column title as it appears in an Excel sheet.

For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:
1       //input
A       //output
Example 2:
28
AB
*/ 
import java.util.*;
class Test
{
    // public int titleToNumber(String s) {
    //     if (s == null) return -1;
    //     int sum = 0;
    //     for (char c : s.toUpperCase().toCharArray()) {
    //         sum *= 26;
    //         sum += c - 'A' + 1;
    //     }
    //     return sum;
    // }
    //  public int convertToTitle(int n) {
    //     StringBuilder result = new StringBuilder();

    //     while(n>0){
    //         n--;
    //         result.insert(0, (char)('A' + n % 26));
    //         n /= 26;
    //     }

    //     return result;
    // }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while(columnNumber > 0){
            columnNumber--;
            sb.append((char)((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        System.out.print(convertToTitle(str));
    }
}
