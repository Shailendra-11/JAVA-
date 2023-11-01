package Lecture_37_Problem_On_Sorting_Algorithm_question;
// Given an arrays of names of the  fruits you are supposed to sort it in lexicographical oder using the selection
// sort
public class Q2 {
     static void lexicographical(String []fruits){
         int n= fruits.length;
         for(int i=0; i<n-1; i++){
             int min_index=i;
             for(int j=i+1; j<n; j++){
                 if(fruits[j].compareTo(fruits[min_index])<0){
                     min_index =j;
                 }
             }
             // swap fruits[mid_index] ,fruits
              String temp = fruits[i];
              fruits[i]= fruits[min_index];
              fruits[min_index]=temp;
         }

     }
    public static void main(String[] args) {
        String [] fruits  ={"kiwi" ,"apple", "papaya" ,"mango" };
        lexicographical(fruits);
//        for (int i=0; i<fruits.length; i++){
//            System.out.print(fruits[i] +" ");
//        }
        for (String val:fruits)
        {
            System.out.print(val +" ");
        }
    }
}
