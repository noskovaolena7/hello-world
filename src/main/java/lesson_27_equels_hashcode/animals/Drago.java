package lesson_27_equels_hashcode.animals;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Drago {

    private String name;
    private int age;
    private double weight;

    public Drago() {
        System.out.println("Викликаємо конструктор без параметрів");
    }

    public Drago(String name, int age, double weight) {
        System.out.println("Виклик констурктора з параметрами");


        this.name = name;
        this.age = age;
        this.weight = weight;

    }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Drago)) {
                return false;
            }

            Drago otherDrago = (Drago) obj;

            return this.name.equals(otherDrago.name)
                && this.age == otherDrago.age
                && this.weight == otherDrago.weight;
                
    }

    @Override
    public int hashCode() {
        int age = this.age;
        int weight = (int)this.weight;
        int name = Objects.hash(this.name);
      

        return 31 * (age + weight + name);

    }
}


