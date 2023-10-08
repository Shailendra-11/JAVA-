package arrays_question_sol;

import java.util.Scanner;

public class Q1 {
    static void SumofArrays(int []x, int n){
          int sum =0;
        for (int i=0; i<n; i++){
            sum +=x[i];
        }
        System.out.println(sum);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of arryas  sizes ");
        int n = sc.nextInt();
        int [] x= new int [n];
        System.out.println("Enter the number " + n + " element ");
        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
        }
       SumofArrays(x, n);



//        int sum =0;
//        for (int i=0; i<n; i++){
//            sum +=x[i];
//        }
//        System.out.println(sum);
    }




}


