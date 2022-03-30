package hand;

public class Handler {
    MessageQueue messageQueue;
    public Handler(){
        messageQueue = new MessageQueue();
    }

    public void sendMessage(Message msg){
        msg.target = this;
        messageQueue.enqueueMessage(msg);
    }

    public void handleMessage(Message msg){

    }




}
