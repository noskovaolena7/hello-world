package lesson_40_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2010, 2.0));
        cars.add(new Car(2005, 1.6));
        cars.add(new Car(2020, 3.0));
        cars.add(new Car(2015, 1.9));

        cars.sort(Comparator.comparing(Car::getYearOfManufacture));
        // це для більш кращого розуміння, що коїться тут Comparator.comparing(Car::getYearOfManufacture))
        //new Comparator<Car>() {
        //    @Override
        //    public int compare(Car c1, Car c2) {
        //        return Integer.compare(
        //            c1.getYearOfManufacture(),
        //            c2.getYearOfManufacture());
        //    }
        //}
        System.out.println("-----------------");

        System.out.println("Sorted by year🚗:");
        for (Car c : cars) {
            System.out.println(c);
        }

        TreeSet<Car> carsByEngine = new TreeSet<>(Comparator.comparingDouble(Car::getEngineCapacity));
        carsByEngine.add(new Car(2010, 2.0));
        carsByEngine.add(new Car(2005, 1.6));
        carsByEngine.add(new Car(2020, 3.0));
        carsByEngine.add(new Car(2015, 1.9));

        System.out.println("----------------------");

        System.out.println("Sorted by engine ⚙️(comparingDouble):");
        for (Car c : carsByEngine) {
            System.out.println(c);
        }

        Comparator<Car> cmp = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Double.compare(c1.getEngineCapacity(), c2.getEngineCapacity());
            }
        };
        TreeSet<Car> set1 = new TreeSet<>(cmp);
        set1.addAll(carsByEngine);

        System.out.println("----------------------");

        System.out.println("Sorted by engine⚙️:");
        for (Car c : set1) {
            System.out.println(c);
        }

        // сортування за роком та двигуном у протилежному порядку
        cars.sort(Comparator.comparingDouble(Car::getEngineCapacity).reversed());
        System.out.println("-----------------------");
        System.out.println("Sorted by years 🚗(descending) using reversed:");
        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println("----------------------");

        TreeSet<Car> carsByEngineDesc = new TreeSet<>(
                Comparator.comparingDouble(Car::getEngineCapacity).reversed()
        );
        carsByEngineDesc.addAll(cars);
        System.out.println("Sorted by engine ⚙️(descending) using reversed:");
        for (Car d : carsByEngineDesc) {
            System.out.println(d);
        }

    }
}