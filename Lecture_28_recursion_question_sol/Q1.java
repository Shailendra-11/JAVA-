package Lecture_28_recursion_question_sol;

import java.util.Scanner;

public class Q1 {
    //Q1 Given a number num and a value k print multiple of num
    static void printMultiples(int num, int k){
        if(k==1){
            System.out.println(num);
            return;
        }
        printMultiples(num, k-1);
        System.out.println(num*k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num and k ");
        int num =sc.nextInt();
        int k = sc.nextInt();
        printMultiples(num,k);
    }
}
