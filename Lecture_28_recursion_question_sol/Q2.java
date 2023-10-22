package Lecture_28_recursion_question_sol;

import java.util.Scanner;

public class Q2 {
    // Q1 sumofseries
    static int SeriesSum1(int n){
        if(n==0)
            return 0;
        return SeriesSum1(n-1)+n;
    }
    // Q2 Given a number n . Find the sum of natural numbers till n but with alternative sign
    static  int SeriesSum2(int n){
        if(n==0) {
            return 0;
        }
        if(n%2==0){// even
              return SeriesSum2(n-1)-n;
        }
        else // 0dd;
         return SeriesSum2(n-1)+n;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        System.out.println("Sum of series n:- "  +SeriesSum1(n));
        System.out.println("Sum of series alternative sign n:- "  +SeriesSum2(n));
    }

}
