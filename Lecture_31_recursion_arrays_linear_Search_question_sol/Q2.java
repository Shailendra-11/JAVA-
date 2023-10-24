package Lecture_31_recursion_arrays_linear_Search_question_sol;

import java.util.Scanner;

public class Q2 {
    // Find the Last index of target in arr
    static int last(int []arr, int index, int target){
        if(index>=arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return last(arr,index-1,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {1,19,34,5,7,5,6,8,19};
        int target =19;

        System.out.println(last(arr, arr.length-1, target));
    }
    }
