package Lecture_42_Binary_Search_Algorithm_question;
// Find the square root .of the given negative value x. Round it off to the nearest
// floor integer value.
public class Q2 {
    static int square(int x){
        int st=0, end=x;
        int ans=-1;
        while(st<=end){
            int mid = st +(end-st)/2;
            long val = mid*mid;// use long here to avoid overflow
            if(val==x){
                return mid;
            } else if (val<x) {
                ans= mid;
                st=mid+1;
            }else {
                end =mid-1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=125;
        System.out.println(square(x));
    }

}
