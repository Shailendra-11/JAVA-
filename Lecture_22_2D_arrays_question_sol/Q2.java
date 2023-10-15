package Lecture_22_2D_arrays_question_sol;

import java.util.Scanner;

public class Q2 {
    static void SpiralArrays(int[][] matirx) {
        for (int i = 0; i < matirx.length; i++) {
            for (int j = 0; j < matirx[i].length; j++) {
                System.out.print(matirx[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] printSpiralOder(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftColm = 0, rightCol = n - 1;
        int cur = 1;
        while (cur <= n * n) {
            // topRow -> left to rightcol
            for (int j = leftColm; j <= rightCol && cur <= n * n; j++) {
                matrix[topRow][j] = cur++;

            }
            topRow++;
            // rightCol -> topRow to BottomRow
            for (int i = topRow; i <= bottomRow && cur <= n * n; i++) {
                matrix[i][rightCol] = cur++;

            }
            rightCol--;

            // bottomRow -> right to leftCol
            for (int j = rightCol; j >= leftColm && cur <= n * n; j--) {
                matrix[bottomRow][j] = cur++;

            }
            bottomRow--;
            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && cur <= n * n; i--) {
                matrix[i][leftColm] = cur++;

            }
            leftColm++;
        }
        return  matrix;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n ");
        int n =sc.nextInt();
        int[][] matrix= printSpiralOder(n);
        SpiralArrays(matrix);

    }
}
