package Linled_list;

public class ll3 {
    public static void displayr(Node head){
        if(head==null)return;
        System.out.println(head.data);
        displayr(head.next);
    }
    public static void rev_display(Node head){
        if(head==null)return;
        rev_display(head.next);
        System.out.print(head.data+" ");
    }
    public static int length(Node a){
        int count = 0;
        while(a!=null){
            a=a.next;
            count++;
        }

        return count;
    }
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
        public static void main(String[] args) {
           Node a = new Node(4);
           Node b = new Node(6);
           Node c = new Node(7);
           Node d = new Node(8);
         /*  System.out.println(a.next);
            a.next = b;
            System.out.println(b);
            System.out.println(a.next);
            System.out.println(a.next.data);*/
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = null;
            // displaying the linked list
            Node temp = a;
            System.out.println(length(a));
        /*    for(int i=0;i<4;i++){
                System.out.println(temp.data);
                temp = temp.next;*/

            /*while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;*/
              //  displayr(a);
               // rev_display(a);
            System.out.println(length(a));
            }


    }

