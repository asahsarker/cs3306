public class Queue {

    private int[] elementArr;
    private int count;
    private int firstElement;
    private int lastElement;
    private int capacity;

    public Queue(int size) {
        elementArr = new int[size];
        firstElement = 0;
        lastElement = -1;
        capacity = size;
        count = 0;

    }

    public int size() {
        return count;
    }

    public void add(int queueItem) {

        // check for queue overflow
        if (isFull()) {
            System.out.println("Queue overflowing, please remove elements or increase size of queue array");
            System.exit(-1);
        }
        System.out.println("Addind your queues " + queueItem);

        lastElement = (lastElement + 1);
        elementArr[lastElement] = queueItem;
        count++;
    }

    public int element() {
        return 0;
    }

    public int peek() {

        if (isEmpty())
        {
           System.out.println("Queue overflowing, please remove elements or increase size of queue array");
           System.exit(-1);
        }

        return elementArr[firstElement];
    }

    public int poll() {
         // check for queue underflow
         if (isEmpty())
         {
            System.out.println("Queue overflowing, please remove elements or increase size of queue array");
            System.exit(-1);
         }
  
         int firstItem = elementArr[firstElement];
         firstElement = (firstElement + 1) % capacity;
         count--;
  
         return firstItem;
    }

    public int remove() {
        return 0;
    }

    // Utility function to check if the queue is full or not
    public boolean isFull() {
        return (size() == capacity);
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return (size() == 0);
    }
}
