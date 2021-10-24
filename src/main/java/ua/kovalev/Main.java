package ua.kovalev;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("test");
        stack.push("my");
        stack.push("programm");
        System.out.println("Main.main stack: " + stack);
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

        stack.push("test");
        stack.push("my");
        stack.push("programm");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
