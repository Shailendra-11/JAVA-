package Lecture_17_arrays_question_sol;

import java.util.Scanner;


public class Q3 {
    // given q queries check if the given is presented
    // in the arrays or not
    // Note:- Values of all the element in the arrays
    // is less than 10 to the power 5
    static int [] makefrequecyArray(int [] arr){
        int []freq = new int[100005];
        for (int i=0; i< arr.length; i++){
            freq[arr[i]]++;
        }
        return  freq;

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
        int[] freq = makefrequecyArray(arr);
        System.out.println("Enter the queries");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else {
                System.out.println("No   ");
            }
            q--;
        }
    }
}
