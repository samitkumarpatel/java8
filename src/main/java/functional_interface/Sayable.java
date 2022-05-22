package functional_interface;
@FunctionalInterface
public interface Sayable {
    // abstract method
    String say(String msg);

    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);

}
