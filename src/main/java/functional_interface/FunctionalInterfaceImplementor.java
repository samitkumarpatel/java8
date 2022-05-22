package functional_interface;

public class FunctionalInterfaceImplementor implements B{
    @Override
    public String doIt(String what) {
        return what;
    }
}
