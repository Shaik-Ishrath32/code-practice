import java.util.*;
public class Linkedlist_insertionatlast {
    public static Node insertatend(Node head,int x){
        Node newnode = new Node(x);
        if(head == null){
            return newnode;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newnode;
        return head;
    }
    public static void printlist(Node node){
        while(node != null){
            System.out.print(node.data);
            if(node.next != null){
                System.out.print("->");
            }
            node = node.next;
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
        int x = 10;
        head = insertatend(head,x);
        printlist(head);
    }
}
