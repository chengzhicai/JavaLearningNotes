package Thread.ThreadPractice;

/**
 * Created by chengzhicai on 2016/10/22.
 */
public class ThreadPracticeOne implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public static void main(String[] args) {
//        ThreadPracticeOne tpo=new ThreadPracticeOne();
//        tpo.run();
        new Thread(new ThreadPracticeOne()).start();
    }

    public ThreadPracticeOne() {

    }

    public ThreadPracticeOne(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "),";
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}

