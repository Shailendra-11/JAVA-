package Lecture_23_2D_arrays_question_sol;

import java.util.Scanner;

public class Q1 {
    // Given a matrix 'a' of dimension n*m and 2 coordinates
    // (l1 ,r1) and (l1 ,r1) and (l2 ,r2) return the sum of rectangle
    // from (l1, r1) to (l1 ,r1)
    // Brute force
    static int findSum(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2;j++){
                sum += matrix[i][j];
            }
        }
       return sum;
    }
    // Second Method
    static void pref(int [][] matrix){
        int r= matrix.length;
        int c= matrix[0].length;
        for(int i=0; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    static int findSum2(int [][] matrix, int l1, int r1, int l2, int r2) {
       int sum=0;
       pref(matrix);
       for(int i=l1; i<=l2; i++){
           // r1 and r2 sum of row
           if(r1>=1){
               sum +=matrix[i][r2] -matrix[i][r1-1];
           }
           else{
               sum +=matrix[i][r2];
           }
       }

       return sum;
    }
    // third method
    static void Findsumpref(int [][] matrix) {
        int r= matrix.length;
        int c= matrix[0].length;
        // traverse horizontally to calculate row-wise prefix sum
        for (int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        // traverse horizontally to calculate column -wise prefix sum
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }


    }
    static int findSum3 (int [][] matrix, int l1, int r1, int l2, int r2){
        int ans=0 ,sum=0,left=0,up=0, leftUp=0 ;
   Findsumpref(matrix);
        sum = matrix[l2][r2];
   if(r1>=1)
       left =matrix[l2][r1-1];
   if(l1>=1)
       up=matrix[l1-1][r2];
   if (l1>=1 && r1>=1)
    leftUp = matrix[l1-1][r1-1];
    ans = sum -up-left+leftUp;

        return sum;
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
        System.out.println("Enter the  value l1 ,r2 and l2 ,r2 ");
        int l1=sc.nextInt();
        int r1= sc.nextInt();
        int l2=sc.nextInt();
        int r2= sc.nextInt();
         System.out.println("Sum of rectangle " +findSum(matrix,l1,r1,l2,r2));
        System.out.println("Sum of rectangle " +findSum2(matrix,l1,r1,l2,r2));
        System.out.println("Sum of rectangle " +findSum3(matrix,l1,r1,l2,r2));
    }
}
