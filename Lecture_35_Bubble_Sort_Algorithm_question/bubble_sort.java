package Lecture_35_Bubble_Sort_Algorithm_question;
import java.util.*;
public class bubble_sort {
    static void Bubble_Sort(int a[]){
         int n=a.length;
         // n-i  iterations/passes
         for(int i=0; i<n-1; i++){
             for(int j=0; j<n-i-1; j++){
//         last i element are already at correct sorted position
                 // so no need to check them
                 if(a[j]>a[j+1]){
                     // swap - a[j] a,[j+1]
                     int temp =a[j];
                     a[j] = a[j+1];
                     a[j+1]=temp;
                 }
             }
         }
         for(int i=0; i<n; i++){
             System.out.print(a[i] +" ");
         }
        }
        // 2end Method
    static void Bubble_Sort2Mehod(int a[]){
        int n=a.length;
        // n-i  iterations/passes
        for(int i=0; i<n-1; i++){
            boolean flag =false ;// has any swapping happened
            for(int j=0; j<n-i-1; j++){
//         last i element are already at correct sorted position
                // so no need to check them
                if(a[j]>a[j+1]){
                    // swap - a[j] a,[j+1]
                    int temp =a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                    flag = true; // same swap has happened
                }
            }
            if(!flag){ // have any swaps happened
                  return;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(a[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i]=scanner.nextInt();
        }
        Bubble_Sort(a);
        Bubble_Sort2Mehod(a);
    }
}
