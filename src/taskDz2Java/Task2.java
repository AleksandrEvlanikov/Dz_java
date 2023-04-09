package taskDz2Java;



import java.util.Arrays;
import java.util.Objects;



public class Task2 {


    public static void stringSplit() {
        String json = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                " {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                " {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        System.out.println(json);

        String[] line = json.split("},");
//        3 строки
//        System.out.println(line[0]);
//        System.out.println(line[1]);
//        System.out.println(line[2]);
        String[] lineOne = line[0].split(":");
//        разбив 1 строки
//        System.out.println(lineOne[0]);
//        System.out.println(lineOne[1]);
//        System.out.println(lineOne[2]);
//        System.out.println(lineOne[3]);
        System.out.println();
        String[] line2 = lineOne[1].split("[\"]");
//        System.out.println(line2[1]);  // Иванов
        String[] line3 = lineOne[2].split("[\"]");
//        System.out.println(line3[1]);  // 5
        String[] line4 = lineOne[3].split("[\"]");
//        System.out.println(line4[1]); // матиматика
        System.out.println();
        System.out.println("Студент " + line2[1] + " получил "+ line3[1]  + " по предмету " + line4[1]);
//        System.out.println("Студент " + line5[1] + " получил "+ line3[1]  + " по предмету " + line4[1]);
//        System.out.println("Студент " + line10[1] + " получил "+ line3[1]  + " по предмету " + line4[1]);

        String[] lineTwo = line[1].split(":");
        // разбив 2 строки
//        System.out.println(lineTwo[0]);
//        System.out.println(lineTwo[1]);
//        System.out.println(lineTwo[2]);
//        System.out.println(lineTwo[3]);
        String[] line5 = lineTwo[1].split("[\"]");
//        System.out.println(line5[1]); // пертова
        String[] line6 = lineTwo[2].split("[\"]");
//        System.out.println(line6[1]); // 4
        String[] line7 = lineTwo[3].split("[\"]");
//        System.out.println(line7[1]); // информатика
        System.out.println("Студент " + line5[1] + " получил "+ line6[1]  + " по предмету " + line7[1]);

        String[] lineThree = line[2].split(":");
        // разбив 3 строки
//        System.out.println(lineThree[0]);
//        System.out.println(lineThree[1]);
//        System.out.println(lineThree[2]);
//        System.out.println(lineThree[3]);
        String[] line8 = lineThree[1].split("[\"]");
//        System.out.println(line8[1]); // краснов
        String[] line9 = lineThree[2].split("[\"]");
//        System.out.println(line9[1]); // 5
        String[] line10 = lineThree[3].split("[\"]");
//        System.out.println(line10[1]); // физика
        System.out.println("Студент " + line8[1] + " получил "+ line9[1]  + " по предмету " + line10[1]);





    }
}