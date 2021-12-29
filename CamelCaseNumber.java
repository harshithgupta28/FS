import java.util.*;
public class CamelCaseNumber{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<0){
            System.out.println("Not Camel Case"); 
            System.exit(0);
        }
        int r,max;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> revarr=new ArrayList<Integer>();
        while(n>0){
            r=n%10;
            arr.add(r);
            n=n/10;
        }
       for(int i=arr.size()-1;i>=0;i--){
           revarr.add(arr.get(i));
       }
     
      max=Collections.max(revarr);
      
      if(max==revarr.get(0)){
          System.out.println("Camel Case");
      }
      else{
          System.out.println("Not Camel Case");
      }
    }
}