import java.util.ArrayList;
import java.util.List;

public class StringQueue {

    private static class Node {
        private final String data;
        private Node next;

        Node(String data) {
            this.data = data;
        }
    }

    private Node start;
    private Node end;
    private int size = 0;

    public void enqueue(String value) {
        if (value == null) return;

        Node newNode = new Node(value);
        if (end == null) {
            start = end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    public String dequeue() {
        if (start == null) return null;

        String value = start.data;
        start = start.next;
        size--;

        if (start == null) {
            end = null;
        }
        return value;
    }

    public void printQueue() {
        if (start == null) {
            System.out.println("Черга порожня");
            return;
        }
        Node current = start;
        while (current != null) {
            System.out.print("[" + current.data + "] ");
            current = current.next;
        }
        System.out.println();
    }

    public List<String> toList() {
        List<String> list = new ArrayList<>(size);
        Node current = start;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    public int getSize() {
        return size;
    }
}