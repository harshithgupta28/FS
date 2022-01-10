/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if 
sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:

Input: sentence = "keshavcollege"
Output: false

*/ 
import java.util.*;
class pangram
{
    public static boolean checkpangram(String sentence)
    {
          int[] alpa = new int[26];
        int len =  sentence.length();
        
        for(int i=0; i<len ;i++){            
            int index = sentence.charAt(i);            
            alpa[index-'a'] = 1;         
                        
        }
        
        for(int j=0; j< alpa.length; j++){
            if(alpa[j] == 0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print(checkpangram(input));
    }
}
