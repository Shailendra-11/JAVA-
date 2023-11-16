// Cheack wether a given bracket sequences is balanced or not 

import java.util.Stack;

public class balanced_bracket {
      static boolean Bal(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch=='(') {
                st.push(ch);
            }else{
                if (st.size()==0) return false;
                if(st.peek()=='(') st.pop();  
                
            }
        }
        if (st.size()>0) {
            return false;
        }
          return true;
      }
    public static void main(String[] args) {
        String str = ")((())";
        System.out.println(Bal(str));
    }
}