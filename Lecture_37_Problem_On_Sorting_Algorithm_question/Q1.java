package Lecture_37_Problem_On_Sorting_Algorithm_question;
// Given an integers arrays arr, move all the 0's to the end of itd white maintaining the relative
// order of the non-zero elements
public class Q1 {
    static void moveZero(int []a){
        int n = a.length;
        for(int i=0; i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(a[j]==0 && a[j+1]!=0){
                    int temp =a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String []args){
        int[] a = {0,5,8,3,4,2};
        moveZero(a);
        for (int val:a) {
            System.out.print(val +" ");
        }
    }
}
