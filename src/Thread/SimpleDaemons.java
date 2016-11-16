package Thread;

import java.util.concurrent.*;

//import static jdk.nashorn.internal.objects.Global.print;//这个包？


/**
 * Created by chengzhicai on 2016/10/26.
 */

//Daemon threads don't prevent the program ending后台线程不会阻止程序结束
public class SimpleDaemons implements Runnable {

    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);//休息100毫秒
                System.out.println(Thread.currentThread() + "" + this);
            }
        } catch (InterruptedException e) {
            System.out.print("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);//daemon后台
            daemon.start();
        }
        System.out.println("All daemon started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
