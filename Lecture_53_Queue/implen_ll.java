public class implen_ll {
    public static class Node{
        int val ;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
public static class queuell{
    Node head = null;
    Node tail= null;
    int size=0;
    public void add(int val){ 
        Node temp = new Node(val);
        if(size==0){
           head=tail=temp; 
        }else{
            tail.next = temp;
            tail= temp;
        }
        size++;
    }
    public  int peek(){
      if (size==0) {
       System.out.println("Queue is empty"); 
       return -1;
        }
        return head.val;
    }
     public int remove(int val){ 
        if(size==0){
            System.out.println("Queue is empty");
        }
           int x= head.val;
           head =head.next;
           size--;
           return x;
    }
    public void display(){
       if (size==0) {
        System.out.println("Queue is empty");
       } 
       Node temp =head;
       while (temp!=null) {
        System.out.print(temp.val+" ");
         temp= temp.next;
       }
       System.out.println();
    }
}
 

    public static void main(String[] args) {
        queuell l= new queuell();
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.display();
        System.out.println("remove :- "  +  l.remove(0));
        System.out.println("peek :- " +  l.peek());
        System.out.println("display");
        l.display();

    }
}
