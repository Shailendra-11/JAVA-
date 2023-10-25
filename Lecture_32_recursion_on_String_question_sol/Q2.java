package Lecture_32_recursion_on_String_question_sol;

import java.util.Scanner;

public class Q2 {
    // Write a program to print reverse of a string using recursion
    // 1 method
    static String reverse(String s, int idx)
    {
        if(idx == s.length()){
            return "";
        }
        return reverse(s,idx+1)+ s.charAt(idx);

    }
    // 2 end method
    static String reverse2(String s)
    {
        if(s.length()==0){
            return "";
        }
        return reverse2(s.substring(1))+ s.charAt(0);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string present a ");
        String s = scanner.nextLine();
        System.out.println("reverse :- " +reverse(s,0));
        System.out.println("reverse :- " +reverse2(s));
    }
}
