package lesson_33_34_optional.classwork;

public class ForestIsFullException extends RuntimeException {
    public ForestIsFullException() {
        System.out.println("Наш ліс вже переповнений");
    }
}
