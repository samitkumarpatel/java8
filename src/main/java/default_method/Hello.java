package default_method;

public interface Hello {
    default String sayHello() {
        return "Hello";
    }
    String sayHi(String name);
}
