package Lecture_42_Binary_Search_Algorithm_question;

import java.lang.reflect.GenericDeclaration;

public class binarySearch {
    static int  bsa(int []a ,int target){
        int st =0, end = a.length-1 ;
        while(st<=end){
            int mid =(st+end)/2;
            if(a[mid]==target){
                return a[mid];
            } else if (target<a[mid]) {
                end=mid-1;
            }else{
                st = mid+1;
            }
        }
        return -1;
    }
    // using recursion method
    static boolean recbsa(int []a , int st , int end ,int target) {
        if (st > end) {
            return false;
        }
        int mid = (st + end) / 2;
        if (target == a[mid]) {
            return true;
        } else if (target < a[mid]) {
          return   recbsa(a, st, mid - 1, target);
        } else {
          return   recbsa(a, mid + 1, end, target);
        }

    }
    public static void main(String[] args) {
        int []a = {1, 2, 6 , 8 , 10 ,12 ,15};
        System.out.println(bsa(a,12));
        System.out.println( " Recursion using "+recbsa(a,0,a.length-1,12));

    }
}
