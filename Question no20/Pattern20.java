import java.util.*;
public class Pattern20{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(int i=0;i<n;i++){
    if(i<=n/2){
       for(int j=0;j<n;j++){
       if(i == j-n/2 || i == n/2-j){
        System.out.print("*\t");
       }
       else {
       System.out.print("\t");
      }

       }
    System.out.println();
    System.out.println();
    }else{
       for(int j =0 ;j<n;j++){
        if(i == j+n/2 || i== n-1-(j-n/2)){
        System.out.print("*\t"); 
        }else {
            
            System.out.print("\t");
        }
       }
      System.out.println();
      System.out.println();

    }

   }

 }

}