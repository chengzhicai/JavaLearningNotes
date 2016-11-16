package Thread;

import java.util.concurrent.*;

/**
 * Created by chengzhicai on 2016/11/9.
 */
public class DaemonFromFactory implements Runnable {
    public void run() {
        try {
            while (true) {
                //TimeUnit 表示给定单元粒度的时间段，它提供在这些单元中进行跨单元转换和执行计时及延迟操作的实用工具方法。
                // TimeUnit 不维护时间信息，但是有助于组织和使用可能跨各种上下文单独维护的时间表示形式。毫微秒定义为千分之一微秒，
                // 微秒为千分之一毫秒，毫秒为千分之一秒，一分钟为六十秒，一小时为六十分钟，一天为二十四小时。
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.print("Interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 10; i++)
            exec.execute(new DaemonFromFactory());
        System.out.print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}

