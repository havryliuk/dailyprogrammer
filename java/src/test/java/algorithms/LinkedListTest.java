package algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    void testLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Sally");
        list.add("Becky");
        list.add("Nick");
        list.add("Jack");
        list.add("Rachel");

        assertTrue(list.contains("Becky"));
        assertFalse(list.contains("Sasha"));

        list.removeFirst();
        list.removeLast();
        assertEquals(new LinkedList<>(Arrays.asList("Becky", "Nick", "Jack")), list);
    }
}
