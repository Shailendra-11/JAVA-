package Lecture_19_arrays_question_sol;

import java.util.Scanner;

public class Q4 {
    static void suffixSum(int []arr){
        int suffix =0;
        int n =arr.length;
        for(int i=n-1;i>=0; i--){
            suffix += arr[i];
            arr[i]= suffix;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " element");
        for (int i =0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       suffixSum(arr);


    }

}
