public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        StringQueue queue = new StringQueue();

        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");
        queue.enqueue("four");

        System.out.println("Вміст черги: ");
        queue.printQueue();

        queue.dequeue();
        queue.dequeue();

        queue.enqueue("inf");

        System.out.println("Вміст черги після редагування: ");
        queue.printQueue();

        int totalLength = queue.toList()
                .stream()
                .skip(1)
                .mapToInt(String::length)
                .sum();

        System.out.println("Сумарна довжина рядків (крім першого): " + totalLength);
    }
}