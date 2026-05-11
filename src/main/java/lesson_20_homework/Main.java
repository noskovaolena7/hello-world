package lesson_20_homework;

import java.time.LocalDate;

public class Main {

    static void main() {

        Car car = new Car(50, 8, LocalDate.of(2026, 12, 31));

        System.out.println("Машина може їхати " + car.canDrive());
        System.out.println("Машина допущена до експлуатації " + car.calculateRange());
        System.out.println("Машина може проїхати " + car.isAllowedToDrive());
    }

}
