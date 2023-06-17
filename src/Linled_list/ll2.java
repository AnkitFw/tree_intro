package Linled_list;

public class ll2 {
    public static class Node{
        int data; // value
        Node next; // address of next
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
       Node a = new Node(6);
        System.out.println(a.next);

        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(7);
        Node e = new Node(4);
        // a->b->c->d->e

         a.next = b;
         b.next = c;
         c.next = d;
         d.next = e;
       // System.out.println(a.next.next.next.data);
        

   // Insertion in Linked list.


    }
}
