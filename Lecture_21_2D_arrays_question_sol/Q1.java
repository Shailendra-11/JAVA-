package Lecture_21_2D_arrays_question_sol;

import java.util.Scanner;

public class Q1 {
    static void PrintArrays(int[][]matirx){
        for (int i = 0; i < matirx.length; i++) {
            for (int j = 0; j <matirx[i].length; j++) {
                System.out.print(matirx[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Wtrite a program to dislplay transpose of matrix entered by user
    //First method
    static int [][] transpose (int [][]x,int r,int c){
        int[][] tran = new int[c][r] ;
        for(int i=0; i<c;i++){
            for (int j=0; j<r; j++){
                tran[i][j] =x[j][i];
            }
        }
        return tran ;
    }
    // Second method in only square matrix
    static void Trans(int [][] x, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp =x[i][j];
                x[i][j]=x[j][i];
                x[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" A arrays enter and row and coloum");
        int r=sc.nextInt();
        int c= sc.nextInt();
        int [][] x = new int[r][c];
        System.out.println("Enter the " +r*c + " element ");
        for (int i=0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        PrintArrays(x);
        System.out.println("Transpose matrix");
         Trans(x,r,c);
         PrintArrays(x);
//        int [][] ans = transpose(x,r,c);
//      PrintArrays(ans);
  }
}
