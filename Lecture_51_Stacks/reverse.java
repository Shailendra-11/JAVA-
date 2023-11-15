 import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);

        // reverse
        // Stack<Integer>rt= new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        //     // int x = st.peek();
        //     // rt.push(x);
        //     // st.pop();
        // }
        // System.out.println(rt);
      //   Question 1;
   // Copy  stack
    // Copy content of one stack to another in same ordr
      Stack <Integer> gt = new Stack<>();
      while(st.size()>0){
        gt.push(st.pop());
      }
      Stack <Integer> ot = new Stack<>();
      while(gt.size()>0){
        ot.push(gt.pop());
      }
      System.out.println(ot);
    }
}
