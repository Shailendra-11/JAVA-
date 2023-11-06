package Lecture_42_Binary_Search_Algorithm_question;
// Find the first occurrences of a given elements x , given that the given
// arrays in sorted.
public class Q1 {
    static int firstOccurrences(int []a, int x){
        int st =0, end=a.length-1;
        int f =-1;
        while(st<=end){
            int mid = st +(end-st)/2;
            if(a[mid]==x){
                f =mid;
                end=mid-1;
            } else if (x<a[mid]) {
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return f;
    }
    static int lastOccurrences(int []a, int x){
        int st =0, end=a.length-1;
        int f =-1;
        while(st<=end){
            int mid = st +(end-st)/2;
            if(a[mid]==x){
                f =mid;
                st=mid+1;
            } else if (x<a[mid]) {
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        int []a = {2,3,3,5,4,4,6,6,6,};
//        System.out.println("first " +firstOccurrences(a,3));
        System.out.println("Last " +lastOccurrences(a,6));

    }
}
