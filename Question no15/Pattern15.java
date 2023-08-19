import java.util.*;
public class Pattern15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ;i<2*n-1;i++){
             
             if(i<n){
              for(int j=0;j<n+i;j++){
                 if(j<2*i)System.out.print("\t");
                 else System.out.print("*\t");
              }
             System.out.println();
             System.out.println();
             }else{
              for(int j =0 ;j<(2*n-1)-(i-n+1);j++){
                int s = (2*n-1)-(i-n+1)-1;
    

                if(j<= s -(2+i-n)   )System.out.print("\t");
                else System.out.print("*\t");
              }
              System.out.println();
             System.out.println();
             }
        }
    }
}