package foreach;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForEachExampleTest {
    @Test
    @DisplayName("forEach test")
    void testOne() {
        ForEachExample<Integer> forEachInteger = new ForEachExample(Arrays.asList(2,5,1,6,7));
        ForEachExample<String> forEachString = new ForEachExample(Arrays.asList("b","a","d","n"));
        assertAll("forEach & forEachOrder",
                () -> {
                    assertEquals(
                            Arrays.asList(2,5,1,6,7),
                            forEachInteger.getMyList(),
                            "Should return the list with order 2,5,1,6,7"
                    );
                },
                () -> {
                    assertEquals(
                            Arrays.asList(2,5,1,6,7),
                            forEachInteger.getOrderedList(),
                            "Should return the list with order 2,5,1,6,7"
                    );
                },
                () -> {
                    assertEquals(
                            Arrays.asList("b","a","d","n"),
                            forEachString.getMyList(),
                            "Should return the list with order b,a,d,n"
                    );
                },
                () -> {
                    assertEquals(
                            Arrays.asList("b","a","d","n"),
                            forEachString.getOrderedList(),
                            "Should return the list with order b,a,d,n"
                    );
                }
        );
    }
}
