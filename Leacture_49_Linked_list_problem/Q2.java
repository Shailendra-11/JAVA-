// Find nth nodes from the end of linked list
public class Q2 {
    // fiest method
    public static Node Secondlast(Node head, int n) {
         int size = 0;
        Node temp = head;
       while(temp!=null){
            size++;
            temp = temp.next;
       }
         int m = size-n+1;
         temp = head;
         for(int i=1; i<=m-1; i++){
               temp = temp.next;
         }
        return temp;
    }
    // Second method best method
    public static Node Secondlast2(Node head, int n) {
           Node slow = head;
           Node fast = head;
         for(int i=1; i<=n; i++){
               fast = fast.next;
         }while(fast!=null){
            slow=slow.next;
            fast=fast.next;
         }
         return slow;
        
    }
    // Q3 question
    public static Node deleteNthNode(Node head ,int n ){
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n;i++){
              fast = fast.next;
              if(fast==null){
                head =head.next;
                  return head;
              }
        }while (fast.next!=null) {
                slow =slow.next;
                fast = fast.next;
        }
        slow.next =slow.next.next;
        return head;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    static void print(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(45);
        Node d = new Node(78);
        Node e= new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // Node temp = Secondlast(a, 3);
        // System.out.println("First " +temp.data);
        // Node t = Secondlast2(a, 3);
        // System.out.println("Second " +t.data);
      print(a);
      a=deleteNthNode(a, 5);
      print(a);
    }
}
