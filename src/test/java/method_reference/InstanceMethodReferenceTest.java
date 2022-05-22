package method_reference;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InstanceMethodReferenceTest {

    @Test
    @DisplayName("Referring non-static method using reference")
    void testOne() {
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();

        Sayable sayable = instanceMethodReference::saySomething;
        assertEquals("Hello, this is a non-static method", sayable.say());

        Sayable sayable1 = new InstanceMethodReference()::saySomething;
        assertEquals("Hello, this is a non-static method", sayable1.say());
    }
}
