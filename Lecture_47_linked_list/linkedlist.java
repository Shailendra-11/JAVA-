import java.util.*;

public class linkedlist {

    public static class Nodes {
        int data;
        Nodes next;

        Nodes(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Nodes a = new Nodes(8);
        Nodes b = new Nodes(5);
        Nodes c = new Nodes(7);
        Nodes d = new Nodes(10);
        Nodes e = new Nodes(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.data);
        System.out.println(d.data);
        System.out.println(e.data);

    }
}