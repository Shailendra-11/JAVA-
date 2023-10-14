package Lecture_21_2D_arrays_question_sol;

import java.util.Scanner;

public class Q2 {
    static void PrintArrays(int[][] matirx) {
        for (int i = 0; i < matirx.length; i++) {
            for (int j = 0; j < matirx[i].length; j++) {
                System.out.print(matirx[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Given a square matrix ,turn it by 90 degree in a clockwise direction with any extra space
    static void Trans(int [][] x, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp =x[i][j];
                x[i][j]=x[j][i];
                x[j][i]=temp;
            }
        }
    }
    static void reverse(int []x){
        int i=0, j=x.length-1;
        while(i<j){
            int temp =x[i];
            x[i]=x[j];
            x[j]= temp;
            i++;
            j--;
        }
    }
  static void rotated (int [][] x, int n){
      // transpose
        Trans(x,n,n);
        // reverse each row of transposed matrix
        for(int i=0; i<n; i++){
               reverse(x[i]);
        }
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" A arrays enter and row and coloum");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n =r*c;
        int[][] x = new int[r][c];
        System.out.println("Enter the " + n + " element ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        PrintArrays(x);
        rotated(x,r);
        System.out.println("Rotation of matrix");
        PrintArrays(x);
    }
}