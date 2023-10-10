package Lecture_17_arrays_question_sol;

import java.util.Scanner;

public class Q2 {
    // Rotated the given arrays 'a' by k steps where k is non-nagtive .
    // NOte:- k can be greater than n as well
    static void Rotated (int arr[] , int k){
        int n = arr.length;
        k = k%n;
        int ans[]= new int[n];
        int j=0;
        for(int i=n-k; i<n; i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(ans [i]+" ");
        }

    }
    // second method
    static void swap(int [] arr , int st, int end){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
//
    }
    static  void rotatelnPlace(int []arr, int k){
        int n= arr.length;
        k = k%n;
        swap(arr,0,n-k-1);
        swap(arr,n-k,n-1);
        swap(arr,0,n-1);

        for( int i=0; i<arr.length; i++){
          System.out.print(arr[i] +" ");
     }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n ");
         int n = sc.nextInt();
         int[] arr= new int [n];
        System.out.println("Enter the " +n + " element" );
         for (int i=0; i< arr.length; i++){
             arr[i]=sc.nextInt();
         }
        System.out.println("Enter the rotated in k ");
         int k = sc.nextInt();;

   // Rotated(arr,k);
        rotatelnPlace(arr,k);



    }
}
