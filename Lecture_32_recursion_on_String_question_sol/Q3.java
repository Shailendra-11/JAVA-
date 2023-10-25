package Lecture_32_recursion_on_String_question_sol;

import java.util.Scanner;

public class Q3 {
    // Write a program to check given string is palindrome
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
        String rev = reverse2(s);
        if(rev.equals(s)){
            System.out.printf("%s is palindrome " ,s);
        }
        else{
            System.out.printf(" %s is Not palindrome " ,s);
        }
    }
}
