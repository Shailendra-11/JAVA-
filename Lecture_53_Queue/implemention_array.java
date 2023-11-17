import java.util.*;
public class implemention_array {
   public static class queueA{
     int f=-1;
     int r=-1;
     int size=0;
     int [] arr = new int [100];
    public void add(int val){
        if(r==arr.length-1){
            System.out.println("Queue is full");
            return;
        }
        if(f==-1){
          f=r=0;
          arr[0]= val;
        } 
        else{
            arr[++r] = val;
        }
        size++;
      }
      public int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        f++;
         size--;
        return arr[f-1];
       
      }
      public int peek(){
        if(size==0)System.out.println("Queue is empty");
        return arr[f];
      }
      public  void display(){
        if (size==0) {
            System.out.println("Queue is empty");
        }
        for(int i=f ; i<=r; i++){
            System.out.print(arr[i] +" ");
        }
      }
            
     }
    
   


    public static void main(String[] args) {
        queueA q = new queueA();
        // q.display();
        q.add(5);
        q.add(8);
        q.add(9);
        q.display();
      System.out.println("remove "+q.remove());
      q.display();
      System.out.println("peek"  +q.peek());

    }
}
