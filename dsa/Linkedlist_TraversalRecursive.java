
/*class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist_TraversalRecursive {
    public static void traverseList(Node head){
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data);
        if(head.next != null){
            System.out.print("->");
        }
        traverseList(head.next);
    }
    public static void main(String[]args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        traverseList(head);
    }
}*/
import java.util.*;
public class Linkedlist_TraversalRecursive{
    public static void traverseList(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data);
        if(head.next != null){
            System.out.print("->");
        }
        traverseList(head.next);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n=4
        Node head = null;
        Node temp = null;
        for(int i=0;i<n;i++){
            int values = sc.nextInt(); // 10 20 30 40
            Node nn = new Node(values);
            if(head == null){
                head = nn;
                temp = nn;
            }else{
                temp.next = nn;
                temp = nn;
            }
        }
        traverseList(head);
    }
}
