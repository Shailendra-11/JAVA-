public class Q2 {
public static class Node {
   int data;
   Node next;
   Node(int data)
   {
    this.data =data;
   }  
}
public static class linked{
    Node head= null;
    Node tail = null;
    void insertAt(int data){
        Node temp = new Node(data);
        if(head==null){
            head=temp;
            tail =temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
    }
    void head (int data){
        Node temp = new Node(data);
        if (head==null){
           head=tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
    }

    void insertidexat(int idx ,int data){
        Node t = new Node(data);
        Node temp = head;
        if (idx==size()) {
            insertAt(data);
            return;
        }
        else if (idx==0){
            head(data);
            return;
        }
        else if (idx<0 || idx>size()){
            System.out.println("wrong idx");
            return;
        }
        for(int i=1; i<=idx-1; i++){
            temp =temp.next;
        }
        t.next =temp.next;
        temp.next =t;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
       
    }
    int size(){
        Node temp = head;
        int count =0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    

}


 public static void main(String[] args) {
    linked ll = new linked();
    ll.insertAt(1);
    ll.insertAt(45);
    ll.insertAt(8);
    ll.display();
    ll.insertAt(89);
    ll.insertidexat(3,5);
    ll.display();
    System.out.println( " tails " +ll.tail.data);
 }   
}
