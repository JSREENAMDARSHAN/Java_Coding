class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Doublylinkedlist{
    Node head;

    public void insertdata(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void displayList(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displaylistfromback(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.prev;
        }
        System.out.println(" null ");
    }

    public void deletedata(int data){
        Node temp = head;

        if(head.data == data){
            head = head.next;
            if(head!=null){
                head.prev = null;
            }
            return;
        }

        while(temp.next!=null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
    
        }
    }
}

public class doublelinkedlist {
    public static void main(String[] args) {
        Doublylinkedlist dll = new Doublylinkedlist();
        dll.insertdata(2);
        dll.insertdata(3);
        dll.displayList();
        //dll.displaylistfromback();
        dll.deletedata(2);
        dll.insertdata(4);
        dll.insertdata(5);
        dll.displayList();
        dll.displaylistfromback();
    }
}
