import java.util.*;
public class Pattern9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ;i<n;i++){
            for(int j=0;j<n+i;j++){
               if(j<n-1-i){
                System.out.print("\t");
               }else{
                System.out.print("*\t");
               }
            }
            System.out.println();
            System.out.println();
        }
    }
}