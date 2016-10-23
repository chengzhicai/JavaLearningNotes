package Thread.ThreadPractice;

/**
 * Created by chengzhicai on 2016/10/22.
 */
public class ThreadPracticeOneTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            new Thread(new ThreadPracticeOne()).start();
        System.out.println("waiting for ThreadPracticeOne");
    }
}
