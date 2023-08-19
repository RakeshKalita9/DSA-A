import java.util.*;
public class Pattern14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
        for(int i =0;i<2*n-1;i++){
            if(i<n){
                for(int j=0;j<n;j++){
                    if(j<n-i-1) System.out.print("\t");
                    else System.out.print("*\t");
                }
            System.out.println();
            System.out.println();
            }else{
              for(int j=0;j<n;j++){
                 if(j<=i-n)System.out.print("\t");
                 else System.out.print("*\t");
              }
              System.out.println();
             System.out.println();
            }
        }



    }
}