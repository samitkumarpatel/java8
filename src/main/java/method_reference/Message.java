package method_reference;

public class Message {
    private String msg;
    public Message(String msg) {
        this.msg = msg;
    }
    public String myMsg() {
        return msg;
    }
}
