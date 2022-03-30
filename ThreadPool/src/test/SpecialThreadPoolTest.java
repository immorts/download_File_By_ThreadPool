package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ThreadTest
 * @Description: TODO
 * @author: immorts
 * @date: 2022/2/25  11:28 上午
 */
public class SpecialThreadPoolTest {
    public static void main(String[] args) {
        String s = new String("few");
        String b = new String("few");
        System.out.println(s.equals(b));
//        ExecutorService pool = Executors.newSingleThreadExecutor();
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
//        Thread t5 = new MyThread();
//        pool.execute(t1);
//        pool.execute(t2);
//        pool.execute(t3);
//        pool.execute(t4);
//        pool.execute(t5);
//        pool.shutdown();

//        ExecutorService pool = Executors.newFixedThreadPool(3);
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
//        Thread t5 = new MyThread();
//        pool.execute(t1);
//        pool.execute(t2);
//        pool.execute(t3);
//        pool.execute(t4);
//        pool.execute(t5);
//        pool.shutdown();

//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
//        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("i:" + 1);
//            }
//        },3,4, TimeUnit.SECONDS);


    }
}
