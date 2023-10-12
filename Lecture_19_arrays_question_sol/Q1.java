package Lecture_19_arrays_question_sol;

import java.util.Scanner;

public class Q1 {
     static void PrintArrays(int[]arr){
         for(int i=0; i<arr.length;i++){
             System.out.print(arr[i] +" ");
         }
         System.out.println();
     }
    // Given an integer arrays 'a' return prefix sum/running
    //sum in the same arrays without creating a new arrays
    // Fist method
    static  int[] sumPrefix(int[]arr){
        int n= arr.length;
        int [] pref = new int[n];
        pref[0]=arr[0];
        for(int i=1; i<n;i++){
            pref[i]= pref[i-1]+arr[i];
         }
        return pref;

    }
    // second method
    static  int[] SumPrefix(int[]arr){
        int n= arr.length;
        for(int i=1; i<n;i++){
            arr[i]= arr[i-1]+arr[i];
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " element");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
       // int []pref =sumPrefix(arr);
      //  PrintArrays(pref);
        int [] pref = SumPrefix(arr);
        PrintArrays(pref);

    }
}
