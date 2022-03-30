package hand;

public class Message {
    Object object;
    Handler target;

    public Message(String object){
        this.object = object;
    }

    @Override
    public String toString() {
        return "Message{" +
                "object=" + object +
                '}';
    }
}
