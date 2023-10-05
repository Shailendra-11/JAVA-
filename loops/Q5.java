package loops;

import java.util.Scanner;
// print the first n factorail number
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//         int fact =1;
//         for (int i=1; i<=n; i++){
//             fact = fact*i;
//             System.out.println(fact +" factroial");
//         }
//        System.out.println(facter + "total")
        // given 2 numbers a and b find  raise to power b
        int a= sc.nextInt();
        int b = sc.nextInt();
        int ans =1;
        for(int i=1; i<=b; i++){
             ans *= a;
        }
        System.out.println(ans);
    }
}
