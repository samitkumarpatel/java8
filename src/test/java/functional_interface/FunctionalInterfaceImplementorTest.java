package functional_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalInterfaceImplementorTest {
    @Test
    @DisplayName("Functional Interface Test")
    void testOne() {
        FunctionalInterfaceImplementor fII = new FunctionalInterfaceImplementor();
        assertEquals("play", fII.doIt("play"));
        assertEquals("Hello", fII.sayHello());
    }
}
