public class implemention_ll_stack {
  public static class Node{
    int val;
    Node next;
    Node(int val){
        this.val =val;
        this.next = null;
    }
}
    public static class LLStack{
        Node head =null;
        int size =0;
        void push(int x){
        Node temp = new Node(x);
        temp.next= head;
        head =temp;
        size++;
        }
     int pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int x =head.val;
        head = head.next;
        return x;
    
     }
     int peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
     }
        // void display(){
        //     Node temp = head;
        //     while(temp!=null){
        //         System.out.print(temp.val+" ");
        //         temp=temp.next;
        //     }
        //     System.out.println();
        // }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
         void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val +" ");
         }
         void display(){
            displayrec(head);
            System.out.println();
         }

    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(7);
        st.display();
        st.pop();
        st.display();
        st.peek();
        st.display();
        st.push(100);
        st.display();

    }
}
