package Lecture_18_arrays_question_sol;

import java.util.Scanner;

public class Q3 {
    // Given an integer array 'a' sotred non-decreasing order ,return an arrays
    // of the square of each number sorted an non-decreasing order
    static void sortSquare(int []arr){
        int n = arr.length;
        int left=0, right=n-1;
        int k=n-1;
        int ans[]= new int[n] ;

        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                 ans[k--]=ans[left]*ans[left];
                 left++;
            }
            else{
                ans[k--]=ans[right]*ans[right];
                right--;
            }
        }
//        while(left<right){
//              int temp = ans[left];
//              ans[left]= ans[right];
//              ans[right]=ans[left];
//              left++;
//              right--;
//        }
        System.out.print ("Sorted  Square Arrays   :- ");
        for ( int i=0; i<ans.length ; i++){
            System.out.print(ans[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortSquare(arr );

    }
}
