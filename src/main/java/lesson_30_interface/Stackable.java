package lesson_30_interface;

public interface Stackable {

    boolean isEmpty();
    boolean isFull();
    void addElementToStack(int element);
    int deleteElementFromStack();
    int readTop();
}
