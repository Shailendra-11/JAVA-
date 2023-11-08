package Lecture_46_Strings_question;
 import javax.swing.*;
 import java.util.*;
public class Q3 {
    static  boolean Palindrome(String str){
        int i=0, j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        String str = "aba";
        int count =0;
         for(int i=0; i<str.length(); i++){
             for(int j=i+1; j<=str.length();j++){
                 if(Palindrome(str.substring(i,j))==true){
                     System.out.print(str.substring(i,j) +" ");
                     System.out.println();
                     count++;
                 }
             }
         }
        System.out.println(count);

    }
}
