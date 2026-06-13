package lesson_41_stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Main {

    static void main() {

        List<Student> studentList = new ArrayList<>();

        Student Anna = new Student("Anna", 17, 5);
        Student Jack = new Student("Jack", 18, 1);
        Student Monica = new Student("Monica", 19, 3);
        Student Fin = new Student("Fin", 20, 2);
        Student Maria = new Student("Maria", 21, 4);
        Student Tom = new Student("Tom", 23, 3);
        Student Margo = new Student("Margo", 22, 6);

        studentList.addAll(List.of(Anna, Jack, Monica, Fin, Maria, Tom, Margo));

       //Фільтруйте студентів, які мають середню оцінку (grade) менше 4.0.
        List<Student> studentsAverageGradeLessThan4 = studentList.stream()
                .filter(student -> student.getGrade() < 4).toList();

        //Знайдіть студента з найвищою оцінкою.
        Optional<Student> maxGrade = studentList.stream()
                .max(Comparator.comparingDouble(Student::getGrade));

        //Підрахуйте кількість студентів, які старші за 20 років.
        double studentsOlderThan20 = studentList.stream()
                .filter(student -> student.getAge() > 20)
                .count();

        //Створіть список імен студентів, відсортованих за середньою оцінкою у спадному порядку.
        List<String> studentNames = studentList.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .map(Student::getName)
                .collect(Collectors.toList());

        //Знайдіть, чи є хоча б один студент із середньою оцінкою 5.0.
        boolean anyGradeFive = studentList.stream()
                .anyMatch(student -> student.getGrade() == 5.0);

        //Виведіть імена студентів, які мають оцінку більше ніж 4.0.
        List<String> namesGradeGreaterThan4 = studentList.stream()
                .filter(student -> student.getGrade() > 4.0)
                .map(Student::getName)
                .collect(Collectors.toList());


        System.out.println("--------------------");
        System.out.println(studentsAverageGradeLessThan4);
        System.out.println("--------------------");
        System.out.println(maxGrade);
        System.out.println("--------------------");
        System.out.println(studentsOlderThan20);
        System.out.println("--------------------");
        System.out.println(studentNames);
        System.out.println("--------------------");
        System.out.println(anyGradeFive);
        System.out.println("--------------------");
        System.out.println(namesGradeGreaterThan4);
    }
}