import java.util.*;
class pattern3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p++;
            }
            System.out.println();
        }
    }
}