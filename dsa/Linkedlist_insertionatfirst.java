import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist_insertionatfirst {
    public static Node insertion(Node head,int x){
        Node newnode = new Node(x);
        newnode.next = head;
        return newnode;
    }
    public static void printlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null){
                System.out.print("->");
            }
            curr = curr.next;
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
        int x = 1;
        head = insertion(head,x);
        printlist(head);
    }
}
