package lesson_7_string;

public class Main {

    void main() {
        // create a string with constructor
        String s1 = new String("Hello");
        System.out.println(s1);

        // prefferd approach: create a string with =
        String s2 = "world";
        System.out.println(s2);

        // string concatenation
        String s3 = s1 + " " + s2;
        System.out.println(s3);


    }
}
