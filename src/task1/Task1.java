package task1;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(stringEvenOrOdd("Ciao a tutti"));
        System.out.println(stringEvenOrOdd("si però no dai."));

        System.out.println(leapYear(1995));
        System.out.println(leapYear(2024));

    }

    public static boolean stringEvenOrOdd(String message) {
        return message.length() % 2 == 0;
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
