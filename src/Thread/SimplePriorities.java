package Thread;

import java.util.concurrent.*;

/**
 * Created by chengzhicai on 2016/10/25.
 */


public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    public String toString() {
        //通过Thread.currentThread()来获得对驱动该任务的Thread对象的引用
        return Thread.currentThread() + ":" + countDown;
    }

    public void run() {
        while (true) {
            //jdk有10个优先级
            // 设置优先级
            Thread.currentThread().setPriority(priority);
            for (int i = 0; i < 1000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    Thread.yield();//需要进一步理解yield()
                }
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));//Thread.MAX_PRIORITY......?
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
