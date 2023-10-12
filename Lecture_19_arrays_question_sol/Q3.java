package Lecture_19_arrays_question_sol;

import java.util.Scanner;

public class Q3 {
    // cheak if we can partition the arrays into two sum subarrys
    // with equal sum more formally , cheak that the Preficx sum of
    // a part of the arrays is equal to the suffix sum of rest of the arrays
     static int findArraysSum (int[]arr){
         int totalsum=0;
         for (int j : arr) {
             totalsum += j;
         }
       return totalsum;
     }
     static boolean equalSum(int[]arr){
         int totalsum =findArraysSum(arr);
         int prefSum=0;
         for (int j : arr) {
             prefSum += j;
             int suffixsum = totalsum - prefSum;
             if(suffixsum==prefSum) {
                 return true;
             }
         }
         return false;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the " + n + " element");
        for (int i =1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partion possible :- "  +equalSum(arr));
    }
}
