package Lecture_30_recursion_arrays_question_sol;

public class Q1 {
    // Q1. Given an arrays , print all its recursively
    static void printArrays(int []arr, int idx){
        if(idx== arr.length){
            return;
        }
        System.out.print(arr[idx]  +" ");
        printArrays(arr, idx+1);
    }
    // Q2 Print the max value of arrays
     static int maxValue (int[] arr, int idx){
       // base case
       if(idx== arr.length-1){
           return arr[idx];
       }
// small problem - idx+1, end of the arrays - max - value
         int smallAns = maxValue(arr,idx+1) ;
       // self work and final ans
          return Math.max(arr[idx],smallAns);
     }
//     Q3. Find the sum of the elements of the arrays
    static int SumArrays(int []arr, int idx){
        if(idx== arr.length-1){
            return arr[idx];
        }
        return arr[idx]+SumArrays(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr ={20,10,3,2,5};
        printArrays(arr,0);
        System.out.println();
        System.out.println("Max value " +maxValue(arr,0));
        System.out.println("Sum of Arrays " +SumArrays(arr,0));
    }
}
