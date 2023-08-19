import java.util.*;
public class Pattern30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n ;i++){
            for(int j = n; j>0 ;j--){
                System.out.print(j+"\t");
            }
            System.out.println();
             System.out.println();
        }
    }
}