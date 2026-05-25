package lesson_28_inharitance;

import static java.lang.Math.PI;

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Коло з радiусом:" + radius);
        System.out.println("Площа: " + calculateArea());
    }
}
