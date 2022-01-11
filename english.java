/*
The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by %
The second word should be changed like all consonants should be replaced by #
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them
Other than these concatenated word, no other characters/string should or message should be written to STDOUT

For example if you print how are you then output should be h%wa#eYOU.

You can assume that input of each word will not exceed more than 5 chars
*/ 
 
import java.util.*;
class Main
{
    public static void main(String args[])
{
int i;  
Scanner sc = new Scanner(System.in);
String p =  sc.next();
String q = sc.next();
String r= sc.next();

r = r.toUpperCase();


char[] a = p.toCharArray();;
char[] b= q.toCharArray();

// char[] c= r.toCharArray();




    for(i=0;i<p.length();i++)
    {
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
            a[i]='%';
    }

    for(i=0;i<q.length();i++)
    {
        if((b[i]>='a'&&b[i]<='z') || (b[i]>='A'&&b[i]<='Z'))
            if(!(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U'))
               b[i]='#';
    }

    // for(i=0;c[i]!='\0';i++)
    // {
    //     if(c[i]>='a'&&c[i]<='z')
    //         c[i]=c[i]-'32';
    // }

    System.out.print(a);
        System.out.print(b);
            System.out.print(r);

}
}