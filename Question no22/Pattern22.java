import java.util.*;
public class Pattern22{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int s = 2*n-1;
    s = s/2;
    for(int i = 0 ; i< n ; i++){
     for(int j=0 ; j<2*n-1 ; j++){
       if(j>s-i && j<s+i) System.out.print("\t");
       else System.out.print("*\t");
     }
      System.out.println();
      System.out.println();
    }


 }
}