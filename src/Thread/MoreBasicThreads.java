package Thread;

/**
 * Created by chengzhicai on 2016/10/22.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("waiting for LiftOff");//LiftOff().run()方法还没完成之前完成的操作
        //每次执行的结果可能不同，因为线程调度机制是非确定性的
    }
}
