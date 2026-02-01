class Stack{
    int arr[];
    int top = -1;

    Stack(int size){
        arr = new int[size];
    }
    
    public void push(int x){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
        System.out.println(x+"Element pushed to stack");
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
}

public class stackusingarray{
    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is : "+stack.peek());
        System.out.println("Removed element: " + stack.pop()); 
        System.out.println("Removed element: " + stack.pop());
        stack.push(40); // Size: 2
stack.push(50); // Size: 3
stack.push(60); // Size: 4
stack.push(70); // Size: 5 (Full)
stack.push(80); // Size: 6 -> OVERFLOW
stack.push(90); // Size: 7 -> OVERFLOW
    }
}