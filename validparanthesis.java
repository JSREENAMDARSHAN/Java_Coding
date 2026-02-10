class Stack {
    char[] arr;
    int top = -1;

    Stack(int size) {
        arr = new char[size];
    }

    public void push(char x) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return '\0'; // return null char
        }
        return arr[top--];
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '\0';
        }
        return arr[top];
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class validparanthesis{
    public static boolean checkParenthesis(String str) { 
        Stack stack = new Stack(str.length()); 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); // If opening bracket, push to stack 
            if (ch == '(' || ch == '{' || ch == '[') { 
                stack.push(ch); 
            } // If closing bracket, check stack 
            else if (ch == ')' || ch == '}' || ch == ']') { 
                    if (stack.isEmpty()) 
                        return false;
                    char top = stack.pop(); // Check matching pairs 
                    if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) { 
                        return false; 
                    } 
                } 
            } 
            return stack.isEmpty();
    }
    public static void main(String[] args){
        String str = "[{}]"; 
        if (checkParenthesis(str)) { 
            System.out.println(str + " is valid"); 
        } else { 
            System.out.println(str + " is NOT valid"); 
        }
        
    }
}