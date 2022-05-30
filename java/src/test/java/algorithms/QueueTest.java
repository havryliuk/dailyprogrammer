package algorithms;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

    @Test
    void testQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(19);
        queue.add(20);

        int removed = queue.remove();
        assertEquals(3, removed);
        assertEquals(2, queue.peek());
        assertEquals(3, queue.size());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
