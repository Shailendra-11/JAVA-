package Lecture_24_Arrayslist_question_sol;

import java.util.*;

public class arrayslis {
    public static void main(String[] args) {
        Integer k = Integer.valueOf(10);
        System.out.println(k);
        ArrayList<Integer>l1 = new ArrayList<>();
    // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        // get an element at index i
        System.out.println(l1.get(1));//5
   // print with for loop
//       for( int i =0; i<l1.size(); i++){
//           System.out.println(l1.get(i));
//       }
     // printing the array list directly
        System.out.println(l1);
    //  adding element at some index i
        l1.add(1,100);
        System.out.println(l1);
 // modifying element at index i
        l1.set(1,10);
        System.out.println(l1);
 //  remove  an element at index i
        l1.remove(1);
        System.out.println(l1);
        // removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
// checking if element exists
        boolean ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);
 // if you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
    }
}
