import java.util.Stack;

public class implenetion{
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
         st.push(10);
          st.push(45);
           st.push(78);
            st.push(7);
           System.out.println(st.peek()); 
           System.out.println(st);
           st.pop();
           System.out.println(st);
           System.out.println("size is : " +st.size());
           while (st.size()>2) {
             st.pop();
           }
           System.out.println(st);
    }

}