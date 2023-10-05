package loops;
 import java.util.*;
public class loopproble {
    public static  void main (String args[]){
         Scanner sc = new Scanner (System.in);
          int n = sc.nextInt();
          int ans=0;
          int original =n;
          while (n>0){
              n= n/10;
              ans++;
          }
        System.out.println( ans +" Number of digit" +original);
    }
}
