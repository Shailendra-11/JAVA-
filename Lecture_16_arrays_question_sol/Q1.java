package Lecture_16_arrays_question_sol;

import java.util.Scanner;

public class Q1  {
    // find the total number of pairs in the arrys whose sum is equal to the given value
// x.
    static  int isumtarget(int []arr, int target){
        int cout=0;
     for (int i=0; i<arr.length; i++){
         for (int j=i+1; j<arr.length;j++){
             if (arr[i]+arr[j]==target)
                 cout++;
         }
     }
       return cout;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n size ");
        int n = sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter number " +n+ " element ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter a traget");
        int target = sc.nextInt();
        System.out.println(isumtarget(arr,target));
    }



}
