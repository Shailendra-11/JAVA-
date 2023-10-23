package Lecture_29_recursion_question_sol;

import java.beans.PropertyEditorManager;
import java.util.Scanner;

public class Q1 {
    // Q1 Given two numbers x and y .Find the given common divisor of x and y using recursion
    // common divisor of x & y using recursion
    // 1st Method
    static int gcdUsingLoops(int x, int y ){
        int reverse =0;
        while(x%y!=0){
            reverse = x%y;
             x=y;
             y=reverse;
        }
         return reverse ;
    }
    // 2nd methods
    static  int gcdUsingRecursion(int x, int y){
        if(y==0){
            return x;
        }
        return gcdUsingRecursion(y, x%y);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        System.out.println("GDS is using loops " +gcdUsingLoops(x,y));
        System.out.println("GDS is using Recursion  " +gcdUsingRecursion(x,y));

    }
}
