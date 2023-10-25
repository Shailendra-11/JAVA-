package Lecture_32_recursion_on_String_question_sol;

import java.util.Scanner;

public class Q1 {
    // Q1 Remove all the occurrence of 'a' from String s="abcax"
    static String remove (String s, int idx){
        // base case
        if(idx==s.length()){
            return "";
        }
        // recursive work
        String smallAns = remove(s,idx+1);
        char currChar =s.charAt(idx);
        // self work
        if(currChar!='a'){
            return currChar +smallAns;
        }
        else {
            return smallAns;
        }


    }
    // 2end method
    static String remove2(String s){
        // base case
        if(s.length()==0){
            return "";
        }
        // recursive work
        String smallAns = remove2(s.substring(1));
        char currChar =s.charAt(0);
        // self work
        if(currChar!='a'){
            return currChar + smallAns;
        }
        else {
            return smallAns;
        }


    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string present a ");
        String s = scanner.nextLine();
        System.out.println("Ans :-  " +remove(s,0));
        System.out.println("Ans2method :-  " +remove2(s));
    }

}
