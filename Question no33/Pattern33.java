import java.util.*;
public class Pattern33{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int i =0;i<n ; i++){
        int s = n-i;
     for(int j =0;j<n+i ;j++){
      if(j<n-i-1)System.out.print("\t");
      else{
           if(j<n-1){
            System.out.print(s+"\t");
            s =s+1;
           }else{
            if(s==n){System.out.print(0+"\t"); s= s-1;;}
            else {System.out.print(s+"\t"); s =s-1;}
           }

      }
     }
     System.out.println();
     System.out.println();
    }
}  
}