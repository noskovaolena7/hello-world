package lesson_30_interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void shouldThrowExceptionWhenStackIsFull() {
        Stack stack = new Stack(2);

        stack.addElementToStack(10);
        stack.addElementToStack(20);

        try {
            stack.addElementToStack(30);
            fail("Помилка: виняток не був кинутий");
        } catch (StackFullException e) {
            System.out.println("Виняток кинутий правильно: " + e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionWhenStackIsEmpty() {
        Stack stack = new Stack(2);
        try {
            stack.deleteElementFromStack();
            fail("Виняток не був кинутий");
        } catch (StackEmptyException e) {
            System.out.println("Виняток кинутий правильно: " + e.getMessage());
        }
    }
}