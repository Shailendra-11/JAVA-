package Lecture_27_recursion_question_sol;

import java.util.Scanner;

public class Q1 {
    // Q1 Given an integer , find out the sum of its digits using recursion
    static int SumofDigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return SumofDigits(n/10)+n%10;

    }
    // Return the cout of Digits in a given numbers n
    static int cout(int n){
        if(n>=0 && n<=9)
            return  1;
        return 1+cout(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Sum of Digits :- " +SumofDigits(n));
        System.out.println();
        System.out.print("Number of  Digits :- " +cout(n));
    }
}
