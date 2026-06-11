package lesson_40_comparable_and_comparator;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Comparable<Car> {
    private int yearOfManufacture;
    private double engineCapacity;

    @Override
    public int compareTo(Car otherCar) {
        int yearCmp = Integer.compare(this.yearOfManufacture, otherCar.yearOfManufacture);
        if (yearCmp != 0) {
            return yearCmp;
        }
        return Double.compare(this.engineCapacity, otherCar.engineCapacity);
    }
}
