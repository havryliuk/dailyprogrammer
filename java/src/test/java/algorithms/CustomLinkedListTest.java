package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomLinkedListTest {

    private CustomLinkedList customLinkedList;

    @BeforeEach
    void setUp() {
        initialise();
    }

    @Test
    void testCustomLinkedList() {
        customLinkedList.displayContent();

        customLinkedList.deleteBackHalf();
        customLinkedList.displayContent();
        assertEquals(3, customLinkedList.head.data);
        assertEquals(4, customLinkedList.head.next.data);
        assertNull(customLinkedList.head.next.next);
    }

    @Test
    void testDeleteFromBack() {
        customLinkedList.deleteKthNodeFromEnd(2);
        customLinkedList.displayContent();
        assertEquals(3, customLinkedList.head.data);
        assertEquals(4, customLinkedList.head.next.data);
        assertEquals(6, customLinkedList.head.next.next.data);
        assertNull(customLinkedList.head.next.next.next);
    }

    private void initialise() {
        customLinkedList = new CustomLinkedList();
        Node node1 = new Node(3);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        Node node4 = new Node(6);

        customLinkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
    }
}
