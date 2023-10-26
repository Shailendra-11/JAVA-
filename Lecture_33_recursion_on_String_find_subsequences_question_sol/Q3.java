package Lecture_33_recursion_on_String_find_subsequences_question_sol;
// Q3 Given an arrays of integers , print sums of all subsets in its .Outputs sums can be
// printed in any other
import java.util.*;
public class Q3 {
    static void SubsetSum(int []a , int n , int idx, int SubsetSum){
         if (idx>=n){
             System.out.println(SubsetSum);
             return;
         }

        SubsetSum(a,n,idx+1,SubsetSum+ a[idx]);// include
        SubsetSum(a,n,idx+1,SubsetSum);// exclude
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n] ;
         for(int i=0;i<a.length; i++){
             a[i]=sc.nextInt();
         }

        SubsetSum(a,a.length,0,0);
    }
}
