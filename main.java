public class Main {

    public static void main(String[] args){

        Queue newQueue = new Queue(10);

        newQueue.add(12);
        newQueue.add(5);
       

        int returnItem = newQueue.poll();
        System.out.println("Removed item " + returnItem);

        System.out.println("peek function " + newQueue.peek());



       

        // System.out.println("The queue size is " + newQueue.size());
    
        }
    }