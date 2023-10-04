package conditional;
import java.util.*;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       // largest number
        if (a>b && a>c){
            System.out.println( a +" largest number ");
        }
        else  if(b>a && b>c)
        {
            System.out.println( b+" largest number ");
        }
        else{
            System.out.println(  c +" largest number ");
        }



//        if (99<n && n>1000){
//            System.out.println( n +" n is three digit");
//        }
//        else{
//            System.out.println( n +" n is three  not digit");
//        }
    }
}
