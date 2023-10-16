package Lecture_24_Arrayslist_question_sol;

import java.util.*;


public class Q1 {
    // Rverse an arrays list Mehtod
    static  void reverseList (ArrayList<Integer>list){
        int i=0, j=list.size()-1;
        while(i<j){
            Integer temp= Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println( "Original Arrays  " +list);
//        Collections.reverse(list);
        reverseList(list);
         System.out.println("Reverse arrays " +list);
//       Collections.sort(list);
//        System.out.println("Ascending in order  " +list);
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println("Descending in order " +list);
//

    }

}
