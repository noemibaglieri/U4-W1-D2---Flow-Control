package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero!");
        int num = scanner.nextInt();

        for (int i = num; i >= 0; i--) {
            int result = i - 1;

            if (result == -1) {
                System.out.println("Fine");
            } else {
                System.out.println(result);
            }
        }

        scanner.close();
    }
}
