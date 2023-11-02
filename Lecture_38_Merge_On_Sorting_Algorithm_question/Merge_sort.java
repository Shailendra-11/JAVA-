package Lecture_38_Merge_On_Sorting_Algorithm_question;

public class Merge_sort  {
     static void  displayArr(int [] a){
         for(int val:a){
             System.out.print(val +" ");
         }
     }
     static void merger (int [] a, int l,int mid ,int r){
         int n1 = mid-l+1;
         int n2 = r-mid;
         int [] left = new int[n1] ;
         int [] right = new int[n2] ;
         int i, j,k;
         for(i=0; i<n1; i++) {
             left[i] = a[l + i];
         }
         for(j=0; j<n2; j++) {
             right[j] = a[mid + 1 + j];
         }
         i=0;
         j=0;
         k=l;
         while(i< n1 && j<n2){
             if(left[i]<right[j]){
                 a[k++] = left[i++];
             }
             else{
                 a[k++]= right[j++];
             }
         }
         while(i<n1){
             a[k++] =left[i++];
         }
         while (j<n2){
             a[k++] =right[j++];
         }
     }
     static  void merger_Sort(int[] a , int l,  int r){
       if(l>= r){
           return;
       }
    int mid =(l+r)/2;
    merger_Sort(a,l,mid);
    merger_Sort(a,mid+1, r);
    merger(a,l,mid,r);


     }
    public static void main(String[] args) {


    int [] a ={4,1,3,5,2,0 ,8};
    int n = a.length;
        System.out.println("Arrays before Sorting");
        displayArr(a);
        merger_Sort(a,0,n-1);
        System.out.println();
        System.out.println("Arrays after Sorting");
         displayArr(a);

}
}
