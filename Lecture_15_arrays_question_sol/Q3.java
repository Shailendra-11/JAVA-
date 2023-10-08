package arrays_question_sol;

import java.util.Arrays;

// Cout the numbers of occurence of particular element x
public class Q3 {
    // Cout the numbers of occurence of particular element x

     static int Coutofx(int arr[], int x){
         int cout=0;
         for (int i=0; i<arr.length; i++){
             if(arr[i]==x){
                 cout++;
             }
         }
     return cout;
     }
     // find the last occurrence of an element x in a given arrays
     static int lastOccurrence (int [] arr, int x){
         int lastIndex=-1;
         for (int i=1; i<arr.length; i++){
             if(arr[i]==x){
                 lastIndex=i;
             }

         }
         return  lastIndex;
     }
     // Cout the number of element stricly greater than value x
    static int Stricly(int arr[], int x){
         int cout=0;
         for (int i=0; i<arr.length;i++){
               if (arr[i]>x){
                   cout++;
               }
         }
         return cout;
    }
    //cheak if the given arrays is sorted or not
    static boolean isSorted(int [] arr){
         boolean cheak = true;
         for (int i=1; i<arr.length; i++){
             if(arr[i]<arr[i-1]){
                 cheak =false;
                     break;
             }
         }
         return cheak;
    }
     static int[] sorted(int [] arr){
         Arrays.sort(arr);
         for (int i=0; i<arr.length; i++){
             System.out.print(arr[i] +" ");
         }
         int [] ans={ arr[0],arr[arr.length-1]};
         return  ans;

     }

    public static void main(String[] args) {
        int arr[]={1,9 ,3,5,6};
       // int x=5;
       // System.out.println(Coutofx(arr,x));
//        System.out.println(lastOccurrence(arr,x));
       // System.out.println(Stricly(arr,x));
      //  System.out.println(" is Sorted arrays :" +isSorted(arr));
        int [] ans= sorted(arr);
        System.out.println( );
        System.out.println("Smallest " + arr[0]);
        System.out.println("Smallest " + arr[arr.length-1]);


    }
}
