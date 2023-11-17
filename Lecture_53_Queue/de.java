// Double queue 
import java.util.*;
public class de {
   public static void main(String[] args) {
      Deque<Integer> d = new LinkedList<>();
       d.addLast(1);
       d.addLast(2);
       d.addLast(3);
       d.addLast(4);
       System.out.println(d);
      System.out.println(d.peek());
      d.addFirst(8);
      System.out.println(d);
      d.addLast(7);
      System.out.println(d.removeFirst());
      System.out.println(d.removeLast());

   } 
}
