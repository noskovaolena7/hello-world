package lesson_9_arrays;

public class Main {

    public static void main(String[] args) {

        // Створити масив цілих чисел і ініціалізувати його будь-якими значеннями
        int [] array = {10, 20, 30, 40};

        // Вивести у консоль довжину масиву
        System.out.println(array.length);

        // Вивести значення кожного елементу масиву у консоль
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);


        // або
        System.out.println("array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("arr[" + i + "] = " + array[i]);
        }

        // Змінити місцями перший і другий елементи масиву

        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        System.out.println("array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("arr[" + i + "] = " + array[i]);
        }


    }
}
