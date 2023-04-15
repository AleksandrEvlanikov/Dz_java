package taskDz6Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop0 = new Laptop(8,524, "Asus", false);
        Laptop laptop1 = new Laptop(6, 250,"Lenova", true);
        Laptop laptop2 = new Laptop(4,124, "Asus", false);
        Laptop laptop3 = new Laptop(8,1024, "Asus", false);
        Laptop laptop4 = new Laptop(8,524, "Lenova", true);
        Laptop laptop5 = new Laptop(8,524, "Asus", true);
        Laptop laptop6 = new Laptop(4, 250,"Lenova", true);
//        System.out.println(laptop6);
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop0);
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
//        System.out.println(laptops);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во оперативной памяти: ");


        if(scanner.hasNextInt()) {
             int quantityRAM = scanner.nextInt();
             boolean laptopSearch = false;
//            System.out.println(quantityRAM);
            System.out.println("Вот подходящие ноутбуки.");
            for (Laptop laptop : laptops) {
                if (laptop.RAM == quantityRAM){
                    System.out.println(laptop);
                    laptopSearch = true;
                }
            }
            if (!laptopSearch) {
                System.out.println("Таких ноутбуков нету.");
            }
        }else {
            System.out.println("Извините, но это явно не число.");
        }

    }
}
