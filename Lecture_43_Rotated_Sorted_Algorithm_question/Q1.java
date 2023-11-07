package Lecture_43_Rotated_Sorted_Algorithm_question;
//  A rotated sorted arrays is a sorted on which rotation operation has been performed
// some numbers itmes.Given a rotated arrays.find the index of minimum elements in the arrays
public class Q1 {
     static int Rotated(int a[]){
         int st=0 , end= a.length-1;
         int n=a.length;
         int ans=-1;
         while(st<=end){
             int mid = st +(end-st)/2;
             if(a[mid]<= a[n-1]){
                 ans=mid;
                 end=mid-1;
             }else{
                 st=mid+1;
             }
         }
         return ans;
     }
    public static void main(String[] args) {
        int a[]={3,4,5,6,8,2};
        System.out.println(Rotated(a));
    }
}