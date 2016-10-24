package Thread;

import java.util.concurrent.*;

/**
 * Created by chengzhicai on 2016/10/23.
 */

public class CachedThreadPool {
    public static void main(String[] args) {
    //ExecutorService(具有生命周期的Executor)
    //ExecutorService对象是使用静态Executor方法创建的
    ExecutorService exec = Executors.newCachedThreadPool();
    for (int i = 0; i < 5; i++)
        exec.execute(new LiftOff());//需要进一步理解new LiftOff()
    exec.shutdown();//防止新任务被提交给Executor
}
}