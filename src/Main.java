import taskDz3Java.Task3;
import taskDz4Java.Task1;
import taskDz4Java.Task2;
//import task.Lesson1Dz1.*;
//import taskDz2Java.Task1;
//import taskDz2Java.Task2;


public class Main {

    public static void main(String[] args) {
        //Dz2.run();
        //Dz1_lesson1.run();
//        Dz3.run();
//      Дз 2
//        Task1.bubbleSort();
//        Task1.write(".");
//        Task2.stringSplit();
//        Дз 3
//        int[] arr = new int[]{9, 4, 8, 3, 1, 6, 5, 2, 7, -88};
//        Task1.mergeSort(arr);
//        Task2.delWholeNumbers();
//        Task3.maxMinMidNumbers();
//        Task1.numbersLinkedList();
        Task2<Integer> task = new Task2<>();
        task.methodsLinkedList();

        task.enqueue(7);
        System.out.println(task.first());
        System.out.println(task.dequeue());
        System.out.println(task.first());



    }
}