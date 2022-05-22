package functional_interface;

public interface A {
    default String sayHello() {
        return "Hello";
    }
}
