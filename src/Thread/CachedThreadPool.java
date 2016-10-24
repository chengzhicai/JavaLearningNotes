package Thread;

import java.util.concurrent.*;

/**
 * Created by chengzhicai on 2016/10/23.
 */

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();//防止新任务被提交给Executor
    }
}