public class double_linklist {
    static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;

        }
    }
 static void display(Node head){
        Node temp = head;
        while(temp!=null){
        System.out.print(temp.val +" ");
        temp =temp.next;
        }
        System.out.println();
    }
 static void display2(Node tail){
        Node temp = tail;
        while(temp!=null){
        System.out.print(temp.val +" ");
        temp =temp.prev;
        }
        System.out.println();
    }
    static void display3(Node Random){
        Node temp = Random;
        while(temp.prev!=null){
        temp =temp.prev;
        }
        while(temp!=null){
        System.out.print(temp.val +" ");
        temp =temp.next;
        }
        System.out.println();
       
    }
     static Node inserationHead(Node head , int x){
        Node t = new Node(x); 
         t.next= head;
         head.prev=t;
          return t;
        //  return head;
     }
      static void inserttail(Node head , int x){
        Node temp = head;
        while (temp.next!=null) {
               temp =temp.next;
        }
        Node t = new Node(x);
         temp.next=t;
         t.prev=temp;
      }
      static void insermid(Node head , int idx, int x){
        Node s = head;
        for(int i=0; i<idx-1; i++){
            s=s.next;
        }
        Node r=s.next;
        Node t = new Node(x);
        s.next =t;
        t.prev=s;
        t.next=r;
        r.prev=t;
      }
    
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(78);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;
        display(a);
        // display2(f);
        // display3(d);

        //  Node Headinsert = inserationHead(a, 0);
        //  display(Headinsert);
        //  display(a);
        // inserttail(a, 45);
        // display(a);
        insermid(a, 3,88);
        display(a);
    }
}