// Implement a method to insert a node at the start of a linked list
public class Q1 {
   public static class Node{
    int data ;
    Node next;
    Node(int data){
        this.data=data;
    }
}
     public static class linked{
        Node head = null;
        Node tail = null;
       void add(int data){
           Node temp = new Node(data);
           if (head==null){
              head=tail=temp;
           }else{
               temp.next=head;
               head=temp;
           }
       }
       void printlinked(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
       }
     }
   


    public static void main(String[] args) {
        linked ll = new linked();
        ll.add(1);
        ll.add(5);
        ll.add(45);
        ll.printlinked();
        
    }
}
