package Lecture_18_arrays_question_sol;

import java.util.Scanner;

public class Q2 {
    /* Given an integer 'a' move all the even integer at the beginning of the arrays
    * followed of the arrays followed by all the add integer . the realative order
    * of odd or even integer does not matters . Return any arrays that statisfies
    * the condition */
    static void SortedEvenOddMethod(int [] arr){
        int n =arr.length;
        int left =0;
        int right= n-1;
        while(left< right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right]=arr[temp];
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
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
        SortedEvenOddMethod(arr);
    }
}
