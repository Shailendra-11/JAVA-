package nestedloops;

import java.util.Scanner;
/*    1
    2   2
    3    3
    444444
*
*
*
*
*
* */
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=c-1; j++);{
                System.out.print(" ");
            }
            for (int k=1; k<=c; k++){
                    if (i==1 || n==1 || k==1 || c==1 ){
                        System.out.print(k);
                    }
                    else{
                        System.out.print(" ");
                    }
            }
        }
    }
}
