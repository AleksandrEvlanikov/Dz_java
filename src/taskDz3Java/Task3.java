package taskDz3Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task3 {
    public static void maxMinMidNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int maxNumbers = Collections.max(numbers);
        System.out.println(maxNumbers);
        int minNumbers = Collections.min(numbers);
        System.out.println(minNumbers);

        int mid1 = 0;
        for (int i : numbers) {
            mid1 += i;
        }
        int mid = mid1 / numbers.size();
        System.out.println(mid);
    }
}
