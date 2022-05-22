package default_method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultMethodTest {
    @Test
    @DisplayName("")
    void testOne() {
        Hello hello = new HelloImplementor();
        assertEquals("Hello", hello.sayHello());
        assertEquals("samit", hello.sayHi("samit"));
    }
}
