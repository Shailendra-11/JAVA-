package Lecture_39_Quicks_On_Sorting_Algorithm_question;

import Lecture_37_Problem_On_Sorting_Algorithm_question.Q1;

public class Quicks_sort {
     static void displayArr(int[] a) {
         for (int val : a) {
             System.out.print(val + " ");
         }
     }
     static void swap(int []a, int i, int j){
         int temp = a[i];
         a[i]=a[j];
         a[j]=temp;
     }
         static int partition(int [] a, int start , int end) {
             int pivot = a[start];
             int cnt = 0;
             for (int i = start+1; i <= end; i++) {
                 if (a[i] <= pivot) {
                     cnt++;
                 }
             }
             int pivotidx = start + cnt;
             swap(a, start, pivotidx);
             int i = start, j = end;
             // elements lesser left , greater -right side of pivot
             while (i < pivotidx && j > pivotidx) {
                 while (a[i] <= pivot) i++;
                 while (a[j] >= pivot) j--;

             if (i < pivotidx && j > pivotidx) {
                 swap(a, i, j);
                 i++;
                 j--;
             }
         }
            return pivotidx;

     }
     static void Quicks_Sort(int [] a , int  start , int end){
         if(start >= end){
             return;
         }
         int pi = partition(a,start,end);
         Quicks_Sort(a,start,pi-1);
         Quicks_Sort(a,pi+1,end);
     }
    public static void main(String[] args) {


        int[] a = {4, 1, 3, 5, 2, 0, 8};
        int n = a.length;
        System.out.println("Arrays before Sorting");
        displayArr(a);
        Quicks_Sort(a, 0, n - 1);
        System.out.println();
        System.out.println("Arrays after Sorting");
        displayArr(a);
    }
}
