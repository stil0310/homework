package geekbrains.hw_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.calculate(5,10, 3, 2));
        System.out.println(Main.check(10, 3 ));
        System.out.println(Main.isPositive(-8));
        System.out.println(Main.greeting("Иван"));
        System.out.println(Main.isIntercalary(1));
        System.out.println(Main.isIntercalary(200));
        System.out.println(Main.isIntercalary(4));
        System.out.println(Main.isIntercalary(800));
    }

    // Задание 1

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // Задание 2

    public static boolean check(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    // Задание 3

    public static boolean isPositive(int number) {
        if (number >= 0 ) {
            return true;
        }
        return false;
    }

    // Задание 4

    public static String greeting(String name)   {
        return "Привет, " + name + "!";
    }

    // Задание 5.

    public static boolean isIntercalary (int year) {
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
