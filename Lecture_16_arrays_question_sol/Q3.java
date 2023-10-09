package Lecture_16_arrays_question_sol;

import java.util.Scanner;

public class Q3 {
    // find the second largest element in the
    static int findmx(int arr[]){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx =arr[i];
            }
        }
        return  mx;
    }
    static int sclargest(int []arr) {
         int mx =findmx(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int sclargest= findmx(arr);

        return sclargest ;
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
        System.out.println(sclargest(arr));
    }
}
