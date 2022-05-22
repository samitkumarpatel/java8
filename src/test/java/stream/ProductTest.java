package stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    List<Product> products;

    @BeforeEach
    void beforeAll() {
        products = Arrays.asList(
                Product.builder().id(1).name("Hp Laptop").price(2400f).build(),
                Product.builder().id(2).name("Dell Laptop").price(3000f).build(),
                Product.builder().id(3).name("Lenovo Laptop").price(2800f).build(),
                Product.builder().id(4).name("Sony Laptop").price(2600f).build(),
                Product.builder().id(5).name("Apple Laptop").price(9000f).build()
        );
    }

    @Test
    @DisplayName("collect product price from stream test")
    void testOne() {
        List<Float> productPriceList = products.stream()
                .map(p -> p.price)
                .collect(Collectors.toList());
        assertEquals(Arrays.asList(2400f,3000f,2800f,2600f,9000f),productPriceList);
    }

    @Test
    @DisplayName("stream to iterate any number of times")
    void testTwo() {
        List<Integer> integers = Stream.iterate(1, element -> element +1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .collect(Collectors.toList());

        assertEquals(Arrays.asList(5,10,15,20,25), integers);
    }

    @Test
    @DisplayName("products stream operations test")
    void testThree() {
        assertAll("products",
                () -> {
                    assertEquals(
                            Arrays.asList(
                                    Product.builder().id(1).name("Hp Laptop").price(2400f).build()
                            ),
                            products.stream()
                                    .filter(product -> product.price == 2400f)
                                    .collect(Collectors.toList()),
                            "Should return one product only"
                    );
                },
                () -> {
                    assertEquals(
                            1,
                            products.stream()
                                    .filter(product -> product.price == 2400f)
                                    .collect(Collectors.toList())
                                    .size(),
                            "Size should be 1"
                    );
                },
                () -> {
                    assertEquals(
                            19800.0f,
                            products.stream()
                                    .map(product -> product.price)
                                    .reduce(0.0f, (sum, price)-> sum+price),
                            "Total Price should be 19800"
                    );
                },
                () -> {
                    assertEquals(
                            19800.0f,
                            products.stream()
                                    .collect(Collectors.summingDouble(product -> product.price)),
                            "stream.collect should return 19800"
                    );
                }
        );
    }
}
