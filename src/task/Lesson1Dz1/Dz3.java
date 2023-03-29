package task.Lesson1Dz1;

import java.util.Scanner;

public class Dz3 {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чило n: ");
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        System.out.println(result);
    }

}

