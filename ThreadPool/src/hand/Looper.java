package hand;


public class Looper {
    MessageQueue mQueue;

    static final ThreadLocal<Looper> sThreadLocal = new ThreadLocal<>();

    public Looper(){
        mQueue = new MessageQueue();
    }

    public static void prepare(){
        Looper looper = sThreadLocal.get();
        if(looper != null){
            throw new RuntimeException("Only one loop");
        }
        sThreadLocal.set(new Looper());
    }

    public static void loop(){
        Looper looper = sThreadLocal.get();
        final MessageQueue queue = looper.mQueue;
        for(;;){
            Message message = queue.next();
            if (message != null) {
                message.target.handleMessage(message);
            }

        }
    }




}
