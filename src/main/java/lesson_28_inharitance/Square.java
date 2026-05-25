package lesson_28_inharitance;

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип фiгури: Квадрат");
        System.out.println("Сторона: " + getWidth());
        System.out.println("Площа: " + calculateArea());
    }
}
