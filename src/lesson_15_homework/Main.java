package lesson_15_homework;

public class Main {
    static void main() {

        // мін з двох чисел
        int a = 5;
        int b = 10;

        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        System.out.println(min);

        // макс з двох чисел
        int c = 3;
        int d = 7;

        int max;

        if (c > d) {
            max = c;
        } else {
            max = d;
        }
        System.out.println(max);

        // абсолютне значення числа
        int x = -8;
        int abs;

        if (x < 0) {
            abs = -x;
        } else {
            abs = x;
        }
        System.out.println(abs);

        // піднесення до степеня

        int k = 2;
        int m = 5;
        int result = 1;

        for (int i = 0; i < m; i++) {
            result = result * k;
        }
        System.out.println(result);

        // округлення до цілої частини
       // double n = 5.89;
       // int p = (int) n;

     //   System.out.println(p);
        // or
        double j = 5.89;
        int whole = 0;

        while (j >= 1) {
            j = j - 1;
            whole++;
        }
        System.out.println(whole);

    }
}