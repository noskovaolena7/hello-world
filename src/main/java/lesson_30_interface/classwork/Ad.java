package lesson_30_interface.classwork;

public interface Ad {

    void showAd(String text);

    default void exampleFunction() {
        System.out.println("🟪Show Ad");
    }
}
