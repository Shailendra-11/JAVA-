package Lecture_36__Insertion_Sort_Algorithm_question;

public class Insertion_Sort {
    static void Insertion_sort(int []a){
        int n = a.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && a[j] < a[j-1]){
                // swap a[j], a[j-1]
                int temp = a[j];
                a[j]= a[j-1];
                a[j-1]=temp;
                j--;

            }
        }
    }
    public static void main(String []args){
          int[] a={8,3,6,5,4,2};
          Insertion_sort(a);
        for (int val:a) {
            System.out.print(val +" ");
        }
    }
}
