import java.util.*;
public class Pattern25{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int s =0;
     for(int i =0 ;i<n;i++){
        for(int j =0; j<n+i ;j++){
         if(j<n-i-1) System.out.print("\t");
         else {
            s =s+1;
            System.out.print(s+"\t");
         }
        }
        System.out.println();
        System.out.println();
     }
    }
}