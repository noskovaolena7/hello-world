package lesson_30_interface;


public class Main {

    public static void main(String[] args) {
        Stack theStack = new Stack(10);

        theStack.addElementToStack(20);
        theStack.addElementToStack(15);
        theStack.addElementToStack(10);
        theStack.addElementToStack(5);

        theStack.deleteElementFromStack();

        System.out.print("Наш стек: ");
        while (!theStack.isEmpty()) {
            int value = theStack.deleteElementFromStack();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();

        Stack stack = new Stack(2);

        try {
            stack.addElementToStack(10);
            stack.addElementToStack(20);
            stack.addElementToStack(30);
        } catch (StackFullException e) {
            System.out.println("ПЕРЕВІРКА 1: " + e.getMessage());
        }

        try {
            stack.deleteElementFromStack();
            stack.deleteElementFromStack();
            stack.deleteElementFromStack();
        } catch (StackEmptyException e) {
            System.out.println("ПЕРЕВІРКА 2: " + e.getMessage());
        }
    }
}
