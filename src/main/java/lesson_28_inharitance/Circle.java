package lesson_28_inharitance;


class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Коло з радiусом:" + radius);
        System.out.println("Площа кола: " + calculateArea());
        System.out.println("Периметр кола: " + calculatePerimeter());
    }
}
