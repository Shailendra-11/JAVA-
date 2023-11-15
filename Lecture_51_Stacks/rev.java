 import java.util.*;
public class rev {
     static void pushatbuttom(Stack<Integer> st, int idx ){
       if (st.size()==0){
       st.push(idx);
       return;
       }
       int top =st.pop();
       pushatbuttom(st, idx);
       st.push(top);
     }

 static void reverse_recursion(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse_recursion(st);
         pushatbuttom(st,top);
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
          int x= sc.nextInt();
         st.push(x);
        }
        System.out.println(st);
        reverse_recursion(st);
        System.out.println(" reverse :- " +st);
         // Stack<Integer> rt = new Stack<>();
         // while (st.size()>0) {
         //    rt.push(st.pop());
         // }
         // System.out.println(rt);
         // Stack<Integer> gt = new Stack<>();
         // while (rt.size()>0) {
         //    gt.push(rt.pop());
         // }
         // System.out.println(gt);
         // while (gt.size()>0) {
         //    st.push(gt.pop());
         // }
         // System.out.println(st);


    }
}
