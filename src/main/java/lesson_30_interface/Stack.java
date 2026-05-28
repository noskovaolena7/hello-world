package lesson_30_interface;

public class Stack implements Stackable{

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void addElementToStack(int element) {
        if (isFull()) {
            System.out.println("Стек повний");
        } else {
            stackArray[++top] = element;
        }
    }
    @Override
    public int deleteElementFromStack() {
        if (isEmpty()) {
            System.out.println("Стек порожній");
            return -1;
        } else {
            return stackArray[top--];
        }
    }
    @Override
    public int readTop() {
        return stackArray[top];
    }
    @Override
    public boolean isEmpty() {
        return (top == -1);
    }
    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
