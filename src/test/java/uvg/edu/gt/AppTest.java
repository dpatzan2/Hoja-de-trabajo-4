package uvg.edu.gt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testPushYPop() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        LinkedListStack<String> stack = new LinkedListStack<>();
        stack.push("Hola");
        stack.push("Mundo");

        assertEquals("Mundo", stack.peek());
        assertEquals("Mundo", stack.peek()); // Peek no debe remover el elemento
        assertFalse(stack.isEmpty());
    }
}
