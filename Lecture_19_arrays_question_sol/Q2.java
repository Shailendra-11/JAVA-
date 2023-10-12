package Lecture_19_arrays_question_sol;

import java.util.Scanner;

public class Q2 {
    // given an arrays of integer of size n answer q quaries
    // where you need to print the sum if values in agiven range
    // of inicates from 1 to r (both included )
    // Note:- The value of 1 and r in queries of 1-base indexing
    static  int[] SumPrefix(int[]arr){
        for(int i=1; i<arr.length;i++){
            arr[i] += arr[i-1] ;
        }
        return arr;

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

        int [] pref = SumPrefix(arr);

        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter range");
            int l= sc.nextInt();
            int r= sc.nextInt();
            int ans =pref[r]-pref[l-1];
            System.out.println("Sum :- " +ans);
        }
    }
}
