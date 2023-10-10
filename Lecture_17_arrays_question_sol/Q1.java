package Lecture_17_arrays_question_sol;

import java.util.Scanner;

public class Q1 {
    // reverse an arrays consisting of integer values
       static void reversefirstmethod(int []arr){
           int n = arr.length;
           int [] ans = new int[n] ;
           int j=0;
           for(int i=n-1; i>=0 ; i--){
               ans[j++]=arr[i];
           }
           for(int i=0; i<arr.length; i++){
               System.out.print(ans[i] +" ");
           }

       }
       // second method
    static void swap(int [] arr){
           int i=0;
           int j=arr.length-1;
             while(i<j){
                 int temp =arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 i++;
                 j--;
             }
        for( i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }


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
      // reversefirstmethod(arr);
        swap(arr);
    }

}
