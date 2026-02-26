//Step 1: create a node class
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
//step2: create LL class
class LinkedList{
    Node head;
    // insert a data(by default end)
    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }
    public void insertAtBeginning(int data) { 
        Node node = new Node(data); 
        node.next = head; 
        head = node; 
    }
    public void displayList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void updateval(int olddata,int newdata){
        Node temp = head;
        while(temp!=null){
            if(temp.data == olddata){
                temp.data = newdata;
                return;
            }
            temp = temp.next;
        }
    }
    public void deleteval(int data){
        Node temp = head;
        
        while(temp.next!=null){
            if(temp.next.data == data){
                temp.next= null;
                return;
            }
            temp = temp.next;
        }
    }
    public void insertAtPosition(int index,int data){
        Node temp  = head;
        Node node = new Node(data);
        int i = 0;
        while(temp!=null && i<index-1){
           temp = temp.next;
           i++;
        }
         
            node.next = temp.next; 
            temp.next = node;
    }
    public int listlength(){
        Node temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public void reverselist(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
public class LinkedListCreation{
    public static void main(String[] args){
      LinkedList ll = new LinkedList();
      ll.insert(2);
      ll.displayList();
      ll.insert(3);
      ll.displayList();
      ll.insertAtBeginning(4);
      ll.displayList();
      ll.updateval(2, 1);
      ll.displayList();
      ll.deleteval(3);
      ll.displayList();
      ll.insertAtPosition(1, 2);
      ll.displayList();
      System.out.println(ll.listlength());
      ll.reverselist();
      ll.displayList();
    }
}