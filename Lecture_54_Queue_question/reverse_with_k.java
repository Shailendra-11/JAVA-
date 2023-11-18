import java.util.*;
public class reverse_with_k {
    public static void main(String[] args) {
    Queue <Integer>q= new LinkedList<>() ;
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       int k=3;
       int n=q.size();
       System.out.println(q);
       Stack <Integer>st = new Stack<>();
        for(int i=0; i<k; i++){
          st.push(q.remove());
        }
        for(int i=0; i<n-k; i++){
            st.push(q.remove());
        }

          while (!st.isEmpty()) {
            q.add(st.pop());
          }
          System.out.println("w" +q);
         for(int i=0; i<n-k;i++){
            q.add(q.remove());
         }
         System.out.println( " reverse k " +q);
      }

    
 }


