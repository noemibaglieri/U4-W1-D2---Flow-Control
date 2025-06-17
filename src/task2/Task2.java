package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int inputNum = scanner.nextInt();

        String value = switch (inputNum) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Wrong number.";
        };

        System.out.println(value);

        scanner.close();
    }
}
