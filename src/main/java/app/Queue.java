/**
* The Queue program implements a queue with different methods: peek, poll, element
* size, remove, add. 
*
* @author  Asah Asikin
* @studentNumber 119416836
* @since   2022-08-05
*/

package app;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * public class Queue which contains all the methods
 */
public class Queue<T> {
    private ArrayList<T> queue;

    /**
     * Class Constructor
     */
    public Queue() {
        this.queue = new ArrayList<T>();
    }

    /**
     * public method which returns size of queue
     * 
     * @return size of queue
     */
    public int size() {
        return queue.size();
    }

    /**
     * public method which adds elements to the queue
     */
    public void add(T element) {
        queue.add(element);
    }

    /**
     * public method which returns the element at the
     * front of the queue. It doesn't remove the element
     * 
     * @return element at front of queue
     * @exception NoSuchElementException if queue is empty
     */
    public T element() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    /**
     * public method which returns the element at the
     * front of the queue. It doesn't remove the element
     * 
     * @return element at front of queue else null if queue is empty
     */
    public T peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.get(0);
    }

    /**
     * public method which returns the element at the
     * front of the queue and removes the element
     * 
     * @return element at front of queue else null if queue is empty
     */
    public T poll() {
        if (queue.isEmpty()) {
            return null;
        }
        T head = queue.get(0);
        queue.remove(0);
        return head;
    }

    /**
     * public method which returns the element at the
     * front of the queue and removes the element
     * 
     * @return element at front of queue
     * @exception NoSuchElementException if queue is empty
     */
    public T remove() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException();
        }
        T head = queue.get(0);
        queue.remove(0);
        return head;
    }
}
