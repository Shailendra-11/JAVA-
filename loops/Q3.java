package loops;

import java.util.Scanner;
// reverse number;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        while (n>0){
            int last = n%10;
            ans = ans*10+last;
            n /=10;
        }
        System.out.println( ans  + " reverse number ");
    }
}
