package nestedloops;

import java.util.Scanner;
// print rectangle
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i=0; i<=r; i++){
            for (int j=0; j<=c; j++ ){
                System.out.print("*" +" ");
            }
            System.out.println();
        }


    }
}
