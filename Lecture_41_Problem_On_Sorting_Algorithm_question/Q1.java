package Lecture_41_Problem_On_Sorting_Algorithm_question;
// Given an arrays where all its elements are sorted in increasing order except two swapped
// elements ,sort it in linear time .Assume there are no duplicates arrays
public class Q1 {
     static void SortedTheArrays(int []num){
         int n = num.length;
         int x=-1 , y=-1;
         if(n<=1){
             return;
         }
         // process the elements
         for(int i=1; i<n; i++) {
             if (num[i - 1] > num[i]) {
                 if (x == -1) {// first conflict
                     x = i - 1;
                     y = i;
                 } else { // 2nd conflict
                     y = i;
                 }
             }
         }
         // swap x, y
         int temp = num[x];
         num[x]=num[y];
         num[y]=temp;

     }
    public static void main(String[] args) {
    int []num = {3,8,6,7,5,9,10};
       SortedTheArrays(num);
        for (int val:num
             ) {
            System.out.print(val + " ");

        }
    }
}
