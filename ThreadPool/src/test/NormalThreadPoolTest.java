package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ThreadPoolExcutor
 * @Description: TODO
 * @author: immorts
 * @date: 2022/2/27  1:18 下午
 */
public class NormalThreadPoolTest {

    public static void main(String[] args) {
        ThreadPoolExecutor es = new ThreadPoolExecutor(2,
                5,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                new ThreadPoolExecutor.CallerRunsPolicy());


        for (int i = 0; i < 20; i++) {
            try {
                es.execute(new MyRunnable("第" + (i+1) + "号线程"));
            } catch (Throwable e) {
                System.out.println("错误为" + e + ",丢弃任务 " + (i+1));
            }

        }
    }

    static class MyRunnable extends Thread{
        private String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + name);
            while(true){

            }
        }
    }

}
