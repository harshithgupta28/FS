import java.util.*;
class commen_name{
    static String samechars(String []arr){
        if(arr.length==0) return "";
        String s="-1";
        for(int i=1;i<arr.length;i++){
            s=arr[0];
            while(arr[i].indexOf(s)!=0){
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println(samechars(arr));
    }
}