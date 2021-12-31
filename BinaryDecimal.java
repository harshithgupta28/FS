/*Write a java Program for Binary To Decimal Conversion
if the given number is not in binary form then print -1
Sample 1:
input=1010
output=10

Sample 2:
input=120001
output=-1

*/ 
import java.util.*;
class BinaryDecimal
{
   
  public static void main(String[] args) {

     Scanner sc = new Scanner (System.in);
     int num=sc.nextInt();

   
    int decimal = convertBinaryToDecimal(num);

       System.out.println(decimal);
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      if(remainder > 1){
      return -1;
      } 
      num /= 10;
     
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    } 
   
    
    return decimalNumber;
  }
}
