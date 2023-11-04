package Lecture_41_Problem_On_Sorting_Algorithm_question;
// Given an arrays of positive and negative integer segregate them in linear time and constant spaces .
// the output should print all negative numbers ,followed by all positive numbers
public class Q2 {
    static void partition(int []num){
        int l=0, r= num.length-1;
        while(l<r){
            while(num[l]<0)l++;
            while (num[r]>=0)r--;
            if(l<r){
                int temp =num[l];
                num[l]=num[r];
                num[r]= temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int []num ={19,-20,7-9,-13,11,-5,-3};
        partition(num);
        for (int val:num
             )
            System.out.print(val + " "); {

        }
    }
}
