public class linked_display {
   public static void display(Nodes head){
      while(head!=null){
        System.out.print(head.data+" ");
        head =head.next;
      }
   }
   public static void recusevily(Nodes head){
    if(head==null){
        return;
    }
    System.out.print(head.data+" ");
    display(head.next);
   }
    public static class Nodes{
        int data;
        Nodes next;
        Nodes(int data){
           this.data=data;
           
        }
       }
       public static int length(Nodes head){
        int cout =0;
        while(head!=null){
            cout++;
            head=head.next;
        }
        return cout;
       }
   public static void main(String[] args) {
       Nodes a = new Nodes(5);
       Nodes b = new Nodes(6);
       Nodes c = new Nodes(7);
       Nodes d = new Nodes(8);
       Nodes e = new Nodes(9);
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
    //    Nodes temp =a;
    //    while(temp!=null){
    //     System.out.println(temp.data);
    //     temp =temp.next;
    //    }
    //    for(int i=1; i<=6; i++){
    //        System.out.print(temp.data +" ");
    //         temp =temp.next;
    //    }
    display(a);
    System.out.println();
    recusevily(a);
    System.out.println();
    System.out.println("Length of linked_List " +length(a));

}}
