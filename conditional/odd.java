package conditional;
import java.util.*;
public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
//        if (n % 2 == 0) {
//            System.out.println(n + " this number is  even");
//        }
//        else{
//            System.out.println( n+ "this number is odd ");
//        }
        // take a number divisible by 5
//        if (n%5==0){
//            System.out.println(n +" divisible by 5");
//        }
//        else{
//            System.out.println( n +" not divisible by 5");
//        }
        // absotue value
        System.out.println( n +" absoltue number");
        if (n<0){
            n= n*(-1);
            System.out.println( n +" absoltue number");
        }

    }

}
