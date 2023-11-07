package Lecture_43_Rotated_Sorted_Algorithm_question;
// Search element in rotated sorted array which duplicated elements
// .Return true if the elements is found else return false

public class Q3 {
    static boolean duplicated(int []a, int target ){ 
        int st=0,end=a.length-1;
        while(st<=end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return true;
            }  if (a[st] == a[mid] && a[end] == a[mid]) {
                st++;
                end--;
            } else if (a[mid] <= a[end]) { // mid to end is sorted
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // st to mid sorted
                if (target >= a[st] && target < a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int []a ={0,0,0,1,1,2,0,0,};
        int target =2;
        System.out.println(duplicated(a,0));
    }
}
