import java.util.*;

public class display {
    public static void main(String[] args) {
        Queue<Integer>st = new ArrayDeque<>();
        st.add(1);
        st.add(2);
        st.add(4);
        st.add(6);
        Queue<Integer>helper = new ArrayDeque<>();
        while (st.size()>0) {
            System.out.print(st.peek() +" ") ;
              helper.add(st.poll());
        }
        while (helper.size()>0) {
            System.out.println("hel" +helper.peek());
            st.add(helper.remove());
        }


    }
}
