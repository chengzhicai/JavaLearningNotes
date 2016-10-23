package Thread;

/**
 * Created by chengzhicai on 2016/10/22.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());//LiftOff.run()和main()方法同时调用
        t.start();
        System.out.println("waiting for LiftOff");
    }
}
