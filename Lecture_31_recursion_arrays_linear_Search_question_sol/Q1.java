package Lecture_31_recursion_arrays_linear_Search_question_sol;

public class Q1 {
    // Q1 . Given an arrays of n integer and a target value x. Print wheater in the arrays or not
    static boolean search(int[] a , int target, int idx){
        // Base case
        if(idx>=a.length){
            return  false;
        }
        //self work
        if(a[idx]==target)
            return true;
        // recursive work
       return  search(a,target,idx+1);
//        if(search(a,target,idx+1)){
//            return true;
//        }
//        else{
//            return false;
//        }
    }
    // Q2 return index of target if target present in array, otherwise return-1
    static int SearchIndex(int[] a , int target, int idx) {
        // Base case
        if (idx >= a.length) {
            return -1;
        }
        //self work
        if (a[idx] == target)
            return idx;
        // recursive work
        return SearchIndex(a, target, idx + 1);
    }

    static void  SearchIndex2(int[] a , int target, int idx ) {
        // Base case
        if (idx >= a.length) {
             return;
        }
        //self work
        if (a[idx] == target)
            System.out.print(idx +" ");
        // recursive work
        SearchIndex2( a, target, idx + 1);
    }
    public static void main(String[] args) {
        int []a = {4,4,54,3,4};
        int target=4;

//        if(search(a,target,0)){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
       // System.out.println(SearchIndex(a,target,0));
       SearchIndex2(a,target ,0);
    }
}
