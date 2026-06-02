package lesson_30_interface;

import org.junit.jupiter.api.Test;

import java.util.Optional;

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

    @Test
    void shouldReturnEmptyOptionalWhenStackIsEmpty() {
        Stack stack = new Stack(2);

        Optional<Integer> result = stack.safeDeleteElement();
        if (result.isPresent()) {
            fail("Помилка: стек порожній, але Optional містить значення");
        }
        System.out.println("Тест пройдено: Optional порожній, як і очікувалось");
    }
    @Test
    void shouldReturnOptionalWithValueWhenStackHasElements() {
        Stack stack = new Stack(2);
        stack.addElementToStack(50);
        Optional<Integer> result = stack.safeDeleteElement();
        if (result.isEmpty()) {
            fail("Помилка: стек мав елемент, але Optional порожній");
        }
        if (result.get() != 50) {
            fail("Помилка: значення не збігається");
        }
        System.out.println("Тест пройдено: Optional містить правильне значення");
    }
}