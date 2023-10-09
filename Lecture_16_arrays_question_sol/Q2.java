package Lecture_16_arrays_question_sol;

import java.util.Scanner;
public class Q2 {
    //Find the unique number in a given arrays where all the elements being repeated with one value being unique
    static int unique(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans =0;
        for (int i=0; i<arr.length; i++){
              if (arr[i]>0){
                  ans =arr[i];
              }
        }
        return ans;

    }
    // find the max and minum
    static void min_max(int []arr) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mn) {
                mn = arr[i];
            }
        }
        System.out.println("Max value :- " +mx+ " Min value :- " +mn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n size ");
        int n = sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter number " +n+ " element ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
//        System.out.println(unique(arr));
        min_max(arr);
    }
}
