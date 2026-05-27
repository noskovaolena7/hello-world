package lesson_28_inharitance;

import lombok.Getter;

@Getter
class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {

        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void displayInfo() {
        System.out.println("Прямокутник:");
        System.out.println("Ширина прямокутника: " + width);
        System.out.println("Висота прямокутника: " + height);
        System.out.println("Площа прямокутника: " + calculateArea());
        System.out.println("Периметр прямокутника: " + calculatePerimeter());
    }
}
