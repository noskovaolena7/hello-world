package lesson_11_switch;

public class Main {
    static void main () {


     char grade = 'X';

        switch(grade) {
            case 'A' :
                System.out.println("Відмінно!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Добре (B або C)"); // Runs IF ([case B] OR [case C])
                break;
            case 'D' :
                System.out.println("Зараховано");
            case 'F' :
                System.out.println("Спробуй ще"); // Runs IF ([case D] OR [case F])
                break;
            default :
                System.out.println("Неправильна оцінка");
        }

        System.out.println("Кінець виконання програми");



    int weekDay = 5;

    String ukrainianDayName;

        switch (weekDay) {
            case 1:
                ukrainianDayName = "Понеділок";
                break;
            case 2:
                ukrainianDayName = "Вівторок";
                break;
            case 3:
                ukrainianDayName = "Середа";
                break;
            case 4:
                ukrainianDayName = "Четвер";
                break;
            case 5:
                ukrainianDayName = "П'ятниця";
                break;
            case 6:
                ukrainianDayName = "Субота";
                break;
            case 7:
                ukrainianDayName = "Неділя";
                break;
            default:
                ukrainianDayName = "weekend";
        }

        System.out.println(ukrainianDayName);

        // або

        int day = 3;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid";
        };

        System.out.println(dayType);


        // з використанням yield

            int number = 2;

            String result = switch (number) {
                case 1 -> {
                    System.out.println("Processing...");
                    yield "One";
                }
                case 2 -> {
                    int x = number * 10;
                    yield "Two: " + x;
                }
                default -> {
                    yield "Other";
                }

            };
        System.out.println("Result = " + result);



}

}