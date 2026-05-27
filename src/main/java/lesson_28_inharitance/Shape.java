package lesson_28_inharitance;

abstract class Shape {


    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.println("Це абстрактна фігура");
    }
}

