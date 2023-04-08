package taskDz4Java;

import java.util.LinkedList;

public class Task2<E> {
    private final LinkedList<Integer> numbers = new LinkedList<>();

    public void methodsLinkedList() {
        numbers.add(15);
        numbers.add(-2);
        numbers.add(-8);
        numbers.add(4);
        numbers.add(5);
        numbers.add(44);
        numbers.add(55);
        numbers.add(9);
        numbers.add(21);
        System.out.println(numbers);

    }

    public void enqueue(E item) {
        numbers.addLast((Integer) item);
    }

    public E dequeue() {
        return (E) numbers.removeFirst();
    }

    public E first() {
        return (E) numbers.getFirst();

    }
}


