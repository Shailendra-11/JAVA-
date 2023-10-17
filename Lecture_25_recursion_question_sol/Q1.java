package Lecture_25_recursion_question_sol;

import java.util.Scanner;

public class Q1 {
//    Q1 . Write a program to print all natural number from 1 to n using recursion
    static void pt(int n){
        if (n==1){
            System.out.print(n + " ");
            return;
        }
        pt(n-1);
        System.out.print(n + " ");
    }
    //   Q1 . Write a program to print all natural number from n to 1 using recursion
    static void nd(int n){
        if (n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        nd(n-1);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter the number ");
        int n = s.nextInt();
        System.out.print("Inceasing :- ");
        pt(n);
        System.out.println();
        System.out.print("Decreasing :- ");
        nd(n);

    }
}
