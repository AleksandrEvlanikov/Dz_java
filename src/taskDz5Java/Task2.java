package taskDz5Java;

import java.util.*;

public class Task2 {
    public static void recurringEmployees() {
        HashMap<String, Integer> employeesCount = new HashMap<>();
        HashMap<Integer, String> listEmployees = new HashMap<>();
        listEmployees.put(1, "Иван Иванов");
        listEmployees.put(2, "Светлана Петрова");
        listEmployees.put(3, "Кристина Белова");
        listEmployees.put(4, "Анна Мусина");
        listEmployees.put(5, "Анна Крутова");
        listEmployees.put(6, "Иван Юрин");
        listEmployees.put(7, "Петр Лыков");
        listEmployees.put(8, "Павел Чернов");
        listEmployees.put(9, "Иван Иванов");
        listEmployees.put(10, "Петр Чернышов");
        listEmployees.put(11, "Мария Федорова");
        listEmployees.put(12, "Марина Светлова");
        listEmployees.put(13, "Мария Савина");
        listEmployees.put(14, "Иван Иванов");
        listEmployees.put(15, "Мария Рыкова");
        listEmployees.put(16, "Петр Лыков");
        listEmployees.put(17, "Анна Мусина");
        listEmployees.put(18, "Анна Владимирова");
        listEmployees.put(19, "Петр Лыков");
        listEmployees.put(20, "Иван Мечников");
        listEmployees.put(21, "Петр Лыков");
        listEmployees.put(22, "Анна Мусина");
//        System.out.println(listEmployees);
//        int result = listEmployees.size();
//        System.out.println(result);

        for (String s : listEmployees.values()) {
            if (employeesCount.containsKey(s)) {
                int count = employeesCount.get(s);
                employeesCount.put(s, count + 1);
            } else {
                employeesCount.put(s, 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(employeesCount.entrySet());
        Collections.sort(sortedList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        for (Map.Entry<String, Integer> k : sortedList) {
            System.out.println(k.getKey() + " " + k.getValue());
        }
    }
}


