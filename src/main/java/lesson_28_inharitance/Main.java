package lesson_28_inharitance;

public class Main {

    public static void main() {
        Circle c = new Circle(5);
        c.displayInfo();


        Rectangle r = new Rectangle(4, 7);
        r.displayInfo();

        Square s = new Square(5);
        s.displayInfo();
    }

}
