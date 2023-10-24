package Lecture_31_recursion_arrays_linear_Search_question_sol;

import java.util.ArrayList;

public class arraylist {

    //Q3 Given an arrays arr of size N and integer x. The tasks is to find lhe indicates of the integer x int
    // in the arrays
    static ArrayList<Integer>allIndices(int []a,int n,int target,int idx){
       // base case
        if(idx>=n){
            return new ArrayList<Integer>();// return empty arraylist
        }
        ArrayList<Integer> ans= new ArrayList<>();
        // self work
        if(a[idx]==target){
            ans.add(idx);
        }
        // recursion work
        ArrayList<Integer> smallAns = allIndices(a,n,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] a ={1,2,4,4,5,4};
        int target =4;
        int n=a.length;
        ArrayList<Integer> ans = allIndices(a,n,target,0);
       for(Integer i:ans){
           System.out.println(i);
       }
    }
}
