package app;
import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void whenAddingOneElement_sizeShouldBeOne() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(1);
        Assert.assertEquals(1, q.size());
    }

    @Test
    public void whenAdd_shouldAddElement() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(100);
        Integer head = q.element();
        Integer expectedHead = 100;
        Assert.assertEquals(expectedHead, head);
    }

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

    @Test
    public void whenPeek_shouldReturnHeadIfQueueIsNotEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(100);
        Integer head = q.peek();
        Integer expectedHead = 100;
        Assert.assertEquals(expectedHead, head);
        Assert.assertEquals(1, q.size());
    }

    @Test
    public void whenPeek_shouldReturnNullIfQueueIsEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        Assert.assertNull(q.peek());
    }

    @Test
    public void whenPoll_shouldRetrievesAndRemovesTheHead() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(100);
        Integer head = q.poll();
        Integer expectedHead = 100;
        Assert.assertEquals(expectedHead, head);
        Assert.assertEquals(0, q.size());
    }

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
