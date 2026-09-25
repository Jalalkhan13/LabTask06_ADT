package AbstractDataTypes;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Size: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop size: " + stack.size());
    }
}