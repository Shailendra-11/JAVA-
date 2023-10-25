package Lecture_32_recursion_on_String_question_sol;

import java.util.Scanner;

public class Palindrome {
    // Write a program to check given string is palindrome
    static boolean isPalindrome(String s, int l,int r){
        if(l>=r){
            return true;
        }
        return (s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string present a ");
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s,0,s.length()-1));

    }
} 