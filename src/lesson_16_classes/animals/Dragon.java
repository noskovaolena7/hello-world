package lesson_16_classes.animals;

public class Dragon {

    private String name;
    private int age;
    private double weight;
    private String color;


    public Dragon () {
        System.out.println("Створено невідомго дракона");
    }

    public Dragon(String name, int age, double weight, String color) {
        System.out.println("Створено повноцінного дракона");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
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

}
