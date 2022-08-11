public class Queue {

    private int[] elementArr;  
    private int count;
    private int firstElement;
    private int lastElement;
    private int capacity;

    
    public Queue(int size) {
        elementArr = new int [size];
        firstElement = 0;
        lastElement = -1;
        capacity= size;
        count = 0;
       
    }

    public int size() {
        return count;
    }

    public void add(int queueItem) {
        lastElement = (lastElement + 1);
        elementArr[lastElement] = queueItem;
        count++;
    } 
    
    public int element() {
        return 0;
    } 
    
    public int peek() {
        return 0;
    } 
    
    public int poll() {
        return 0;
    }

    public int remove() {
        return 0;
    }
}
