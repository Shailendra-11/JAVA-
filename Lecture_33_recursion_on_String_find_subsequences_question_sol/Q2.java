package Lecture_33_recursion_on_String_find_subsequences_question_sol;
// Q2 Given a string , write a method to print all its subsequences
import java.util.*;
public class Q2 {

    static void printSSQ( String s , String currAns){
       if(s.length()==0){
           System.out.println(currAns);
           return;
       }
        char curr =s.charAt(0);
        String remString =s.substring(1);
        // Curr char --chooses to be a part of curr
        printSSQ(remString, currAns+curr);
        // curr char- doest not chose to be a part of currAns
        printSSQ(remString, currAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find subsequences");
        String s = sc.nextLine();
        String currAns = " ";
        printSSQ(s,currAns);


    }
}
