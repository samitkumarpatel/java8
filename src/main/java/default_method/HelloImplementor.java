package default_method;

public class HelloImplementor implements Hello{
    @Override
    public String sayHi(String name) {
        return name;
    }
}
