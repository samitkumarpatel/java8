package method_reference;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import java.util.function.BiFunction;

public class StaticMethodReferenceTest {
    @Test
    @DisplayName("Referring static method")
    void testOne() {
        //Referring static method
        Sayable sayable = StaticMethodReference::saySomething;
        assertEquals("Hello , this is a static method", sayable.say());
    }

    @Test
    @DisplayName("Referring static method to BiFunction.apply method")
    void testTwo() {
        //Referring static method
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        assertEquals(Integer.valueOf(5),adder.apply(2,3));

        BiFunction<Float,Integer,Float> adder2 = Arithmetic::add;
        assertEquals(Float.valueOf(5.15f),adder2.apply(2.15f,3));
    }
}
