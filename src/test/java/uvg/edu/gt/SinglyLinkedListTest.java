package uvg.edu.gt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    @Test
    public void testInsertYDelete() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());

        list.insert("Primero");
        list.insert("Segundo");
        list.insert("Tercero");

        assertFalse(list.isEmpty());
        assertEquals("Primero", list.delete());
        assertEquals("Segundo", list.delete());
        assertEquals("Tercero", list.delete());
        assertTrue(list.isEmpty());
    }

}