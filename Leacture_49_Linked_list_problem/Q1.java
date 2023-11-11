// can

import javax.print.attribute.standard.Fidelity;

public class Q1 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next=null;

        }
    }

    public static class LinkedList {
        Node head=null;
        Node tail=null;
        void insertNode(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
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
        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(1);
        ll.insertNode(5);
        ll.insertNode(10);
        ll.print();
       // ll.add(2,9);
        ll.print();
    }
}





































