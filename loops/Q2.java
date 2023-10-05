package loops;

import java.util.Scanner;
// find  the sum of digits in a given number
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int initial =0;

        while (n>0){
            initial += n%10;
            n= n/10;
        }
        System.out.println( initial+" sum of digits " );
    }
}
