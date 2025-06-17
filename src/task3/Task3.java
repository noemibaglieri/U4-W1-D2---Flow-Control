package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message;

        while (true) {
            System.out.println("Say something:");
            message = scanner.nextLine();
            char[] listOfChars = message.toCharArray();

            for (int i = 0; i < listOfChars.length; i++) {
                char singleChar = listOfChars[i];
                System.out.println(singleChar + ",");
            }

            if (message.equals(":q")) break;
        }

    }
}
