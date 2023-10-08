package arrays_question_sol;

import java.util.Scanner;

public class Q2 {
    static void change_arrays(int []arr){
        for (int i=0; i<arr.length; i++){
            arr[i]=0;
        }
    }
    static void PrintArrays(int []arr){
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +"  ");;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [5];
        arr [0] =5;
        arr[1]=4;
        arr[2]=6;
        arr[3]=9;
        arr[4]=10;


//        System.out.println("Enter the number of arryas  sizes ");
//        int n = sc.nextInt();
//        int [] arr= new int [n];
//        System.out.println("Enter the  " + n + " element ");
//        for (int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
        // trying to copy arr to arr_2
        int [ ] arr_2 = arr.clone();
        System.out.println("copy arr_2");
        PrintArrays(arr_2);
        change_arrays(arr);
        System.out.println(" change arrys " );
        PrintArrays(arr);

    }
}
