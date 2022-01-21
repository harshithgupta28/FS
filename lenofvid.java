/* Write a java program for the following Scenario
You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54").

Create a function that takes the video length and return it in seconds.

Examples input /output
input      output
01:00  --> 60

13:56  --> 836

10:60  --> -1
Notes
--> The video length is given as a string.
--> If the number of seconds is 60 or over, return -1 (see example #3).
--> You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid).

*/ 
import java.util.*;
class lenofvid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String arr[]=a.split(":");
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=Integer.parseInt(arr[i]);
        }
        int min=arr1[0]*60;
        int sec=arr1[1];
        int result=min+sec;
        if(sec>=60){
            System.out.println("-1");
        }
        else{
            System.out.println(result);
        }
        
        
        
        
    }
}