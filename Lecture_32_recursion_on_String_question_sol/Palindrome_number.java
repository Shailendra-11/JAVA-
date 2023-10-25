package Lecture_32_recursion_on_String_question_sol;

import java.util.Scanner;

public class Palindrome_number {
    static boolean ispPal(int []arr, int l, int r){
        if (l>=r){
            return true;
        }
        return (arr[0]== arr[r-1] && ispPal(arr,l+1,r-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr =new int[n];
        for (int i=0; i< arr.length; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print("The input array is ");
        if (ispPal(arr, 0, n - 1)) {
            System.out.println("a palindrome.");
        } else {
            System.out.println("not a palindrome.");
        }

    }
}
