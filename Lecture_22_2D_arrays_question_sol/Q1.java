package Lecture_22_2D_arrays_question_sol;

import java.util.Scanner;

public class Q1 {
    // Given an matrix 'a' return all element of the
    // matrix in spiral matrix
    static void SpiralArrays(int[][] matirx) {
        for (int i = 0; i < matirx.length; i++) {
            for (int j = 0; j < matirx[i].length; j++) {
                System.out.print(matirx[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOder(int [][]matrix,int r, int c){
        int topRow=0, bottomRow=r-1, leftColm=0, rightCol =c-1;
        int totalemenet =0;
        while(totalemenet<r*c){
            // topRow -> left to rightcol
            for(int j=leftColm; j<=rightCol && totalemenet<r*c;j++){
                System.out.print(matrix[topRow][j] +" ");
                totalemenet++;
            }
            topRow++;
            // rightCol -> topRow to BottomRow
            for(int i=topRow; i<=bottomRow && totalemenet<r*c; i++){
                System.out.print(matrix[i][rightCol] +" ");
                totalemenet++;
            }
            rightCol--;

            // bottomRow -> right to leftCol
            for(int j=rightCol; j>=leftColm && totalemenet<r*c;j--){
                System.out.print(matrix[bottomRow][j] +" ");
                totalemenet++;
            }
            bottomRow--;
             // leftCol -> bottomRow to topRow
            for (int i= bottomRow; i>=topRow && totalemenet<r*c ; i--){
                System.out.print(matrix[i][leftColm]  +" ");
                totalemenet++;
            }
            leftColm++;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" A arrays enter and row and coloum");
        int r=sc.nextInt();
        int c= sc.nextInt();
        int [][] matrix = new int[r][c];
        System.out.println("Enter the " +r*c + " element ");
        for (int i=0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input arrays ");
        SpiralArrays(matrix);
        System.out.println("Sprial Matrix ");
        printSpiralOder(matrix,r,c);

    }

}
