package lesson_28_inharitance;

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void displayInfo() {
        System.out.println("Квадрат");
        System.out.println("Сторона квадрата: " + getWidth());
        System.out.println("Площа квадрата: " + calculateArea());
        System.out.println("Периметр квадрата: " + super.calculatePerimeter() / 4);
    }
}
