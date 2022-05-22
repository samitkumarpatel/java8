import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream {
    @Test
    public void testOne() {
        List<Integer> listOfInts = Arrays.asList(1,2,3,4,5)
                .stream()
                .map( x -> x *2 )
                //.filter( y -> y > 5)
                .collect(Collectors.toList());

        System.out.println(listOfInts);
        assertEquals(Arrays.asList(2,4,6,8,10), listOfInts);
    }
}
