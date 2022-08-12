package app;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue<T> {
    private ArrayList<T> queue;

    public Queue(){
        this.queue = new ArrayList<T>();
    }

    public int size() {
        return queue.size();
    }

    public void add(T element) {
        queue.add(element);
    }

    public T element(){
        if (queue.isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    public T peek(){
        if (queue.isEmpty()){
            return null;
        }
        return queue.get(0);
    }

    public T poll(){
        if (queue.isEmpty()){
            return null;
        }
        T head = queue.get(0);
        queue.remove(0);
        return head;
    }

    public T remove(){
        if (queue.isEmpty()){
            throw new NoSuchElementException();
        }
        T head = queue.get(0);
        queue.remove(0);
        return head;
    }
}
