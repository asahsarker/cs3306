package app;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("size before removing elements: " + queue.size());

        do {
            System.out.println(queue.poll());
        } while (queue.peek() != null);

        System.out.println("size after removing elements: " + queue.size());


    }
}