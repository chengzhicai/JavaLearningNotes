package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chengzhicai on 2016/10/23.
 */
public class FixedThreadPool {
    public static void main(String[] args){
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0;i<5;i++)
            exec.execute(new LiftOff());
        //execute方法详情：在未来某个时间执行给定的命令。该命令可能在新的线程、已入池的线程或者正调用的线程中执行，这由 Executor 实现决定。
        exec.shutdown();//启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
    }
}
