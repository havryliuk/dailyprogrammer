package algorithms;

import org.junit.jupiter.api.Test;

import java.util.Enumeration;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    @Test
    void testStack() {
        Stack<String> stack = new Stack<>();
        stack.push("main");
        stack.push("builder");
        stack.push("external-service");
        stack.pop();
        stack.push("parse-extenral-data");
        stack.pop();
        stack.pop();
        stack.peek();
        assertEquals(1, stack.size());

        Enumeration<String> e = stack.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
