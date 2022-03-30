package test;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: MyQueue
 * @Description: TODO
 * @author: immorts
 * @date: 2022/3/7  8:04 下午
 */
public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue(Stack<Integer> stack1, Stack<Integer> stack2) {
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    void add(int a){
        stack1.push(a);
    }
    int pop(){
        if(!stack2.isEmpty()){
            return stack2.pop();
        } else if(stack1.isEmpty()){
            return -1;
        } else {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(new Stack<>(), new Stack<>());
        myQueue.add(1);
        myQueue.add(2);
        System.out.println(myQueue.pop());
        myQueue.add(3);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        System.out.println(myQueue.pop());
        myQueue.add(7);
        myQueue.add(8);
        System.out.println(myQueue.pop());
        myQueue.add(9);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

        AtomicInteger atomicInteger = new AtomicInteger();

    }

}
