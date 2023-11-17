import java.util.*;

public class simple{
public static void main(String [] args){
  Queue <Integer> a = new ArrayDeque<>();
  Queue<Integer> q= new LinkedList<>();
  q.add(1);
  q.add(2);
  q.add(3);
  q.add(5);
  System.out.println(q);
  q.remove();
  System.out.println(q);
  System.out.println(q.element());
  System.out.println(q.size());
}
}