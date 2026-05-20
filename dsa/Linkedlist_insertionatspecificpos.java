import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist_insertionatspecificpos {
    public static Node insertatspecificpos(Node head,int pos,int val){
        if(pos < 1) return head;
        if(pos == 1) {
            Node newnode = new Node(val);
            newnode.next = head;
            return newnode;
        }
        //at something pos
        Node curr = head;
        for(int i=0;i<pos-1 && curr!=null;i++){
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        Node newn = new Node(val);
        newn.next = curr.next;
        curr.next = newn;
        return head;

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
        int pos = sc.nextInt();
        int val = sc.nextInt();
        head = insertatspecificpos(head,pos,val);
        printlist(head);

    }
}
