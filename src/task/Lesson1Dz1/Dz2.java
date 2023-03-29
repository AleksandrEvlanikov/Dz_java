package task.Lesson1Dz1;

public class Dz2 {
    public static void run(){
        for (int num = 2; num < 1000; num++) {
            boolean simpleNum = true;
            for (int i = 2; i < num ; i++) {
                if (num % i == 0) {
                    simpleNum = false;
                    break;
                }
            }
            if (simpleNum){
                System.out.println(num);
            }
        }
    }
}
