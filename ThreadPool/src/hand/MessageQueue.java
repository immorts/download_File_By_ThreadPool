package hand;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MessageQueue {

    BlockingQueue<Message> messageBlockingDeque = new ArrayBlockingQueue<>(100);
    //添加两个方法get 与 put
    public void enqueueMessage(Message msg){
        try {
            messageBlockingDeque.put(msg);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Message next(){
       Message msg = null;
       try {
           //没有消息的时候就会阻塞
           msg = messageBlockingDeque.take();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       return msg;
    }


}
