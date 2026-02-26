class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class circularll{
    Node head;

    public void insertdata(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next!=head){
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
    }

    public void displayList(){
        Node temp = head;

        do { 
            System.out.print(temp.data + " -> "); 
            temp = temp.next; 
        } while (temp != head);
        System.out.println(head.data+" back to head ");
    }
}

public class circularlinkedlist {
    public static void main(String[] args) {
        circularll cll = new circularll();
        cll.insertdata(2);
        cll.insertdata(3);
        cll.insertdata(5);
        cll.displayList();
    }
}
