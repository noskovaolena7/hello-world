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
            throw new StackFullException("Стек повний! Неможливо додати елемент: " + element);
        }
            stackArray[++top] = element;
    }
    @Override
    public int deleteElementFromStack() {
        if (isEmpty()) {
            throw new StackEmptyException("Стек порожній! Немає що видаляти.");
        }
            return stackArray[top--];
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
