package test;

/**
 * @ClassName: HundredThread
 * @Description: TODO
 * @author: immorts
 * @date: 2022/3/10  6:24 下午
 */
public class HundredThread {
    static Object object = new Object();
    static int num = 0;
    static class Mythread extends Thread{
        private int i;
        Mythread(int i){
            this.i = i;
        }

        @Override
        public void run() {
            while(num < 100){
                synchronized (object){
                    if(num % 3 != i){
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else{
                        System.out.println(currentThread().getName()+ " " + num);
                        num++;
                        object.notifyAll();
                    }
                }
            }

        }
    }
    public static void main(String[] args) {
        Mythread thread1 = new Mythread(0);
        Mythread thread2 = new Mythread(1);
        Mythread thread3 = new Mythread(2);
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
