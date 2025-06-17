package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un messaggio:");
        String message = scanner.nextLine();
        char[] arrayOfChars = message.toCharArray();

        
        scanner.close();
    }
}
