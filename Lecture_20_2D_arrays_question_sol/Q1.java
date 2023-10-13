package Lecture_20_2D_arrays_question_sol;

import java.util.Scanner;

public class Q1 {

// Addition of 2 matrix
        static void sumofmartix ( int[][] A, int r1, int c1, int[][] B, int r2, int c2){
            if (r1 != r2 || c1 != c2) {
                System.out.println("Wrong input =- Addtion not possible");
                return;
            }
            int[][] sum = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }

        }
        // matric mutlticpilcation
        static void Multiofmartix ( int[][] A, int r1, int c1, int[][] B, int r2, int c2){
            if (c1 !=r2) {
                System.out.println("Wrong input =- Mutliply not possible");
                return;
            }
            int[][] multi = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        multi[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(multi[i][j] + " ");
                }
                System.out.println();
            }

        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" A arrays enter and row and coloum");
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        int [][]A = new int[r1][c1];
        System.out.println("Enter the " +r1*c1 + " element ");
        for (int i=0; i<r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println(" B arrays is enter and row and coloum");
        int r2=sc.nextInt();
        int c2= sc.nextInt();
        int [][]B = new int[r2][c2];
        System.out.println("Enter the " +r2*c2 + " element ");
            for (int i=0; i<r2; i++){
                for (int j=0; j<c2; j++){
                    B[i][j]= sc.nextInt();
                }
        }

              Multiofmartix( A,r1,c1,B,r2,c2);
//            sumofmartix(A,r1,c1,B,r2,c2);
    }
}
