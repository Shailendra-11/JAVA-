import java.util.Stack;

public class insert {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(8);
        st.push(10);
        st.push(15);
        System.out.println(st);
         int idx= 2;
         int x=7;
        Stack<Integer> gt = new Stack<>();
        while(st.size()>1){
           gt.push(st.pop());
        }
        st.push(x);
        while (gt.size()>0) {
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}

