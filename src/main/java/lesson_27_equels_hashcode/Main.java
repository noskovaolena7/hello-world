package lesson_27_equels_hashcode;

import lesson_27_equels_hashcode.animals.Drago;

public class Main {

    static void main() {

        Drago wind = new Drago();
        wind.setName("Вiтер");
        wind.setAge(6);
        wind.setWeight(10.5);


        System.out.println("Дракончика звати: " + wind.getName());
        System.out.println("Вік дракончика: " + wind.getAge());
        System.out.println("Вага дракончика: " + wind.getWeight());

        Drago fire = new Drago("Вогонь", 12, 5.5);
        Drago fire2 = new Drago("Вогонь", 12, 5.5);

        System.out.println("Дракончика звати: " +  fire.getName());
        System.out.println("Вік дракончика: " +  fire.getAge());
        System.out.println("Вага дракончика: " +  fire.getWeight());



        System.out.println();
        System.out.println("------------");
        System.out.println(wind.equals(fire));
        System.out.println();
        System.out.println(wind.hashCode());
        System.out.println(fire.hashCode());
        System.out.println(fire2.hashCode());

    }
}
