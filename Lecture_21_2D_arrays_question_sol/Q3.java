package Lecture_21_2D_arrays_question_sol;

import java.util.Scanner;

public class Q3 {
    //Given an integer n, retrun the fist n row of pascals triangle In Pascal's triangle
    // each number is the sum of two numbers directly above it is show
    static void PascalArrays(int[][] matirx) {
        for (int i = 0; i < matirx.length; i++) {
            for (int j = 0; j < matirx[i].length; j++) {
                System.out.print(matirx[i][j] + " ");
            }
            System.out.println();
        }
    }
     static int [][]pascal(int n) {
         int[][] ans = new int[n][];
         for (int i = 0; i < n; i++) {
             // ith row has i+1 columns
             ans[i] = new int[i + 1];
             // 1st and last element of every row is 1
             ans[i][0]=ans[i][i]=1;
             for(int j=1;j<i; j++){
                 ans[i][j] = ans[i-1][j] +ans[i-1][j-1];
             }
         }
         return ans;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n =sc.nextInt();
        int[][] ans =pascal(n);
        System.out.println("Pascals triangle");
        PascalArrays(ans);
    }
}
