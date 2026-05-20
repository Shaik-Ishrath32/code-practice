
/*class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }

}
public class Linkedlist_Traversal {
    public static void traverseList(Node head){
        while(head != null){ 
            System.out.print(head.data);
            if(head.next != null){
                System.out.print("->");
            }
            head = head.next; 
        }
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
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist_Traversal {
    public static void traverseList(Node head){
        while(head != null){
            System.out.print(head.data);
            if(head.next != null){
                System.out.print("->");
            }
            head = head.next;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node temp = null;
        for(int i=0;i<n;i++){
            int values = sc.nextInt();
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