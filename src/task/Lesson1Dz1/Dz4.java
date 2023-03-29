package task.Lesson1Dz1;

import java.util.Scanner;

public class Dz4 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чило n: ");
        int n = scanner.nextInt();
        Scanner scannerOne = new Scanner(System.in);
        System.out.println("Введите чило m: ");
        int m = scannerOne.nextInt();
        Scanner scannerStr = new Scanner(System.in);
        System.out.println("Введите действие(* или / или + или -): ");
        String a = scannerStr.next();
        int result;


        if (a.equals("+")) {
            result = n + m;
            System.out.println(result);
        } else if (a.equals("*")) {
            result = n * m;
            System.out.println(result);
        } else if (a.equals("-")) {
            result = n - m;
            System.out.println(result);
        } else if (a.equals("/")) {
            if (m == 0) {
                System.out.println("Делить на ноль нельзя!");
            }
            result = n / m;
            System.out.println(result);
        }
    }
}
