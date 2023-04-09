package taskDz2Java;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Task1 {
    private static final Logger LOG = Logger.getLogger(Task1.class.getName());

    public static void write(String path) {

        try (FileWriter in = new FileWriter("task1.txt")) {
            String[] data = bubbleSort();
            for (String datum : data) {
                in.append(datum);
            }
            LOG.log(Level.INFO, "Recorded! :)");
//            throw new IOException("Error");
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);

        }


    }


    //    private static final Logger LOGGER = Logger.getLogger(Task1.class.getName());
    public static String[] bubbleSort() {
        int[] mas = {8, 2, 4, 6, 1};
        System.out.println(Arrays.toString(mas));

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(mas));
        }
        LOG.info("Some message");
        return new String[0];
    }

}
