package method_reference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConstructorReferenceTest {
    @Test
    @DisplayName("Constructor Reference")
    void testOne() {
        Messageable messageable = Message::new;
        assertEquals("Hello", messageable.getMessage("Hello").myMsg());

    }
}
