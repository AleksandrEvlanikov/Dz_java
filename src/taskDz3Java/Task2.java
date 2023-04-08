package taskDz3Java;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Task2 {

    public static void delWholeNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(17);
        numbers.add(-8);
        numbers.add(54);
        numbers.add(12);
        numbers.add(-42);
        numbers.add(999);
        numbers.add(3);
        numbers.add(-73);
        numbers.add(500);
        numbers.add(1);

        System.out.println(numbers);
        ArrayList<Integer> newNumbers = new ArrayList<>();
        for(int arr : numbers) {
            if (arr % 2 != 0) {
                newNumbers.add(arr);
            }
        }
        System.out.println(newNumbers);

    }

}
