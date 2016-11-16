package Thread;

import java.util.concurrent.ThreadFactory;

/**
 * Created by chengzhicai on 2016/11/9.
 */
class DaemonThreadFactory implements ThreadFactory {
    public  Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
