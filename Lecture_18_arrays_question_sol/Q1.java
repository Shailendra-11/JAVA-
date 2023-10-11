package Lecture_18_arrays_question_sol;

import java.nio.file.FileStore;
import java.util.Scanner;
public class Q1 {
    // sorted an arrays consisting of only 0s and 1s
    //first Mehtod
    static void Sorte(int []arr){
        int zero=0;
        // cout zero
        for (int i=0; i< arr.length; i++){
            if(arr[i]==0){
                zero++;
            }
        }
        // 0 to zero-1; 0, zeroes to n-1:1;
        for (int i=0; i<arr.length; i++ ){
            if(i<zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        System.out.print ("Sorted Arrays :- ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
            }

    }
    // Second method
      static void SortedSecondMethod(int [] arr){
        int n =arr.length;
        int left =0;
        int right= n-1;
        while( arr[left]< arr[right]){
            if(arr[left]==0 && arr[right]==1){
                  int temp = arr[left];
                  arr[left]= arr[right];
                  arr[right]=arr[temp];
                  left++;
                  right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
          System.out.print ("Sorted Arrays :- ");
          for (int i=0; i< arr.length; i++){
              System.out.print(arr[i]+ " ");
          }
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n ");
        int n = sc.nextInt();
        int[] arr= new int [n];
        System.out.println("Enter the " +n + " element" );
        for (int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
       // Sorte(arr);
        SortedSecondMethod(arr);

    }
}
