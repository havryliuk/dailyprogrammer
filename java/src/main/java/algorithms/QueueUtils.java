package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {

    public void printBinary(int size) {
        if (size <= 0) return;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < size; i++) {
            int current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
    }
}
