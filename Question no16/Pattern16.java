import java.util.*;
public class Pattern16{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(int i =0;i<2*n-1;i++){
      if(i<n){
         for(int j=0;j<2*n-1-2*i;j++){
            if(j<n-i-1){
            System.out.print("\t");
            }else{
               System.out.print("*\t");
            }
         }
         System.out.println();
         System.out.println();
         
   }else{
       for(int j=0;j<2*(i-n+1)+1;j++){
        if(j<(i-n+1))System.out.print("\t");
        else System.out.print("*\t");
       }
         System.out.println();
        System.out.println();

   }

  }

}
}