package algorithms;

public class CustomLinkedList {
    Node head;

    public void displayContent() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteBackHalf() {
        Node slow = head;
        Node fast = head;
        Node previous = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            previous = slow;
            slow = slow.next;
        }

        previous.next = null;
    }

    public void deleteKthNodeFromEnd(int index) {
        if (head == null || index == 0) return;

        Node first = head;
        Node second = head;

        for (int i = 0; i < index; i++) {
            second = second.next;
            if (second.next == null) {
                // index >= length of the list
                if (i == index - 1) {
                    head = head.next;
                }
                return;
            }
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
    }
}
