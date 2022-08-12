package app;

import org.junit.Assert;
import org.junit.Test;

/**
 * testing functionality for queue class
 */
public class QueueTest {

    /**
     * When adding one element, size should be one
     */
    @Test
    public void whenAddingOneElement_sizeShouldBeOne() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(1);
        Assert.assertEquals(1, q.size());
    }


    /**
     * To check if element has been added to queue
     */
    @Test
    public void whenAdd_shouldAddElement() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(100);
        Integer head = q.element();
        Integer expectedHead = 100;
        Assert.assertEquals(expectedHead, head);
    }


    /**
     * Should Return The Head element And not Remove It
     */
    @Test
    public void whenElement_shouldReturnTheHeadAndNotRemoveIt() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(100);
        q.add(101);
        q.add(102);
        Integer head = q.element();
        Integer expectedHead = 100;
        Assert.assertEquals(expectedHead, head);
        Assert.assertEquals(3, q.size());
    }


    /**
     * Should Return Head element If Queue Is Not Empty
     */
    @Test
    public void whenPeek_shouldReturnHeadIfQueueIsNotEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(100);
        Integer head = q.peek();
        Integer expectedHead = 100;
        Assert.assertEquals(expectedHead, head);
        Assert.assertEquals(1, q.size());
    }

    /**
     * Should Return null If Queue Is  Empty
     */
    @Test
    public void whenPeek_shouldReturnNullIfQueueIsEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        Assert.assertNull(q.peek());
    }


    /**
     * Should retrieve and remove the head
     */
    @Test
    public void whenPoll_shouldRetrievesAndRemovesTheHead() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(100);
        Integer head = q.poll();
        Integer expectedHead = 100;
        Assert.assertEquals(expectedHead, head);
        Assert.assertEquals(0, q.size());
    }

    /**
     * Should retrieves and remove the head 
     */
    @Test
    public void whenRemove_shouldRetrievesAndRemovesTheHead() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(100);
        Integer head = q.remove();
        Integer expectedHead = 100;
        Assert.assertEquals(expectedHead, head);
        Assert.assertEquals(0, q.size());
    }
}
