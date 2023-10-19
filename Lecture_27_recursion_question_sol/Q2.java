package Lecture_27_recursion_question_sol;

import java.util.Scanner;

public class Q2 {
    // Given two numbers p ans q , find the value p power q using recursion function
    // 1st mehtod
    static int pow(int p , int q){
        if (q ==0){
            return 1;
        }
        return pow(p, q-1) *p;
    }
    // 2nd mehtod
    static int pow2(int p, int  q){
        if(q==0){
            return 1;
        }
        int smallpow= pow2(p ,q/2);
        if(q%2==0){
           return smallpow*smallpow;
        }
        else{
            return p*smallpow*smallpow;
        }


    }
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the p and q value");
        int p= sd.nextInt();
        int q = sd.nextInt();
        System.out.println("Ans :- " +pow(p,q));
        System.out.println("Second Method Ans :- " +pow2(p,q));

    }
}


