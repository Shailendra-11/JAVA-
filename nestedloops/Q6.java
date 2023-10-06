package nestedloops;

import java.util.Scanner;
// numerical recantgle
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(j +" ");
            }
            for (int k=1; k<=i-1; k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }

    }
}
