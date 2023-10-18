package Lecture_26_recursion_question_sol;

import java.util.Scanner;

public class Q1 {
    // Find the value of factorial n using recursion
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    // Program to find nth fibonacci number
    static int  fib (int n){
        if(n==0 || n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial :- " + fact(n));
        for (int i=0; i<=n; i++) {
            System.out.print(fib(i) +" ");
        }
    }

}
