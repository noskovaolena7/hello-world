package lesson_20_homework;

import java.time.LocalDate;

public class Car {
    // Заповненість бака
    // Витрата палива на 100 км
    // Рік наступного техогляду
    private double fuelLevel;
    private double fuelConsumptionPer100km;
    LocalDate nextInspectionDate;

    public Car(double fuelLevel, double fuelConsumptionPer100km, LocalDate nextInspectionDate) {
        this.fuelLevel = fuelLevel;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
        this.nextInspectionDate = nextInspectionDate;
    }

    // Машина може їхати
    public boolean canDrive() {
        if (fuelLevel > 0) {
            return true;
        }
        return false;
    }
    /*  public boolean canDrive() {
        return fuelLevel > 0;*/

    // Скільки машина може проїхати
    public double calculateRange() {
        if (fuelLevel <= 0) {
            return 0;
        }
        if (fuelConsumptionPer100km <= 0) {
            return 0;
        }
        double distance = (fuelLevel / fuelConsumptionPer100km) * 100;
        return distance;
    }
    /* if (fuelLevel <= 0 || fuelConsumptionPer100km <= 0) {
            return 0;
        }
        return (fuelLevel / fuelConsumptionPer100km) * 100;
    }  */

    // Машина допущена до експлуатації
    public boolean isAllowedToDrive() {
        LocalDate today = LocalDate.now();

        if (today.isAfter(nextInspectionDate)) {
            return false;
        } else {
            return true;
        }
        /*  LocalDate today = LocalDate.now();
        return !today.isAfter(nextInspectionDate);


    @Override
    public String toString() {
        return "Car{" +
                "fuelLevel=" + fuelLevel +
                ", fuelConsumptionPer100km=" + fuelConsumptionPer100km +
                ", nextInspectionDate=" + nextInspectionDate +
                '}';
    }*/
    }
}
