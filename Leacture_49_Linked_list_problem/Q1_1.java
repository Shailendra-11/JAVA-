public class Q1_1 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
             this.next=null;
            
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void insert(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void dislpay() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null");
        }

        int size() {
            Node temp = head;
            int cout = 0;
            while (temp != null) {
                cout++;
                temp = temp.next;

            }
            return cout;
        }

        void add(int idx, int data){
            Node temp = new Node(data);
            Node first = head;
            int i=0;
            while(i<idx-1){
                first =first.next;
                i++;
            }
            temp.next =first.next;
            first.next = temp;
          
        }
         int firstrevome(){
            int val = head.data;
             head = head.next;
             return val;

         }
         int lastremove(){
            int last = tail.data;
            tail =head.next;
            return last;
         }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insert(1);
        ll.insert(3);
        ll.insert(85);
        ll.insert(5);
        ll.insert(89);
        // System.out.println();
        // ll.add(1, 5);
        ll.dislpay();
        System.out.println();
         System.out.println( "remove elements "+ll.firstrevome());
          System.out.println( "last elements "+ll.lastremove());
        // System.out.println(" size :- " + ll.size());

    }
}
