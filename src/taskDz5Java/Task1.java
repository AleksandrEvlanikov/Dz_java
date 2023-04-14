package taskDz5Java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
//    Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//    что 1 человек может иметь несколько телефонов.
    public static Map<String, List<String>> pB = new HashMap<>();
    public static void phoneBook() {

        pB.put("Иванов Иван",List.of( "+79856452424","+79856693524", "+79857891256") );
        pB.put("Иванов Петя", List.of( "+79812399998", "+79456666695"));
        pB.put("Иванов Сергей", List.of( "+7925488888", "+9854777758"));
        System.out.println(pB);

        for (Map.Entry<String, List<String>> entry : pB.entrySet()) {
            if (entry.getKey().equals("Иванов Иван")) {
                System.out.println(entry);
            }
        }


    }


}
