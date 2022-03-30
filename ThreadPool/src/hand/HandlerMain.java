package hand;

import java.util.LinkedList;
import java.util.List;

public class HandlerMain {
    static class MyHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            System.out.println(msg.object.toString());
            getInt();
        }
    }

    static void getInt(){
        System.out.println("thread -- > " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
//        final Handler handler = new MyHandler();
//        Looper.prepare();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("thread -- > " + Thread.currentThread().getName() + "发送消息");
//                handler.sendMessage(new Message("12321"));
//            }
//        }).start();
//        Looper.loop();
//        3
//                [1,2,3,4,8,9,10]
//[5,2,10,3,1,2,2]

        System.out.println(busiestServers(3,new int[]{1,2,3,4,8,9,10},new int[]{5,2,10,3,1,2,2}));
    }

    public static List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int[][] struct = new int[k][2];
        int index = 0;
        int max = 0;
        List<Integer> res = new LinkedList<>();
        for(int i = 0;i < k;i++){
            struct[i][0] = arrival[i]-1;
        }
        for(int i = 0;i < arrival.length;i++){
            index = i % k;
            if(struct[(index) % k][0] <= arrival[i]-1){
                struct[(index) % k][0] += load[i];
                struct[(index) % k][1]++;
            } else {
                for(int j = 0;j < k;j++){
                    if(struct[j % k][0] <= arrival[i]-1){
                        struct[j % k][0] += load[i];
                        struct[j % k][1]++;
                        break;
                    }
                }

            }
            for(int m = 0;m < k;m++){
                System.out.print(struct[m][0] + " " + struct[m][1] + "   ");
            }
            System.out.println();

        }
        for(int i = 0;i < k;i++){
            max = Math.max(max,struct[i][1]);
        }
        for(int i = 0;i < k;i++){
            if(struct[i][1] == max){
                res.add(i);
            }
        }
        return res;

    }
}


