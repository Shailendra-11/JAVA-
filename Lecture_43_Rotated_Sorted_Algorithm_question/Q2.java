package Lecture_43_Rotated_Sorted_Algorithm_question;
// Given  the rotated sorted arrays of integers which contains distinct elements and an integers target
// return th index of target if it is in arrays otherwise return -1
public class Q2 {
    static int Tragetindex(int []a, int target) {
        int st = 0, end = a.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < a[end]) { // mid to end is sorted
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else{ // st to mid sorted
                if(target>=a[st] && target<a[mid]){
                    end =mid-1;
                }else{
                    st=mid+1;
                }

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int a []={3,4,5,1,2};
        int target =4;
        System.out.println(Tragetindex(a,9));
    }
}
