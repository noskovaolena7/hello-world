package lesson_16_17_18_classes_method_enum.animals;

public class Drago2 {

    private String name;
    private int age;
    private double weight;
    private String color;
    private Drago2Breed breed;


    public Drago2(String name, int age, double weight, String color, Drago2Breed breed) {
        System.out.println("Створено повноцінного дракона");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.breed = breed;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Drago2Breed getBreed() {
        return breed;
    }

    public void setBreed(Drago2Breed breed) {
        this.breed = breed;
    }

    public void speak() {
        System.out.println(name + ": Привiт! Я дракон і я можу говорити!");
    }

    public void fire() {
        System.out.println(name + " випускає вогонь!");


    }

    @Override
    public String toString() {
        return "Drago2 {" +
                "name=" + name + '\'' + ", age=" + age +
                ", weight=" + weight +
                ", color='" + color +
                ", breed=" + breed +
                '}';
    }

}



