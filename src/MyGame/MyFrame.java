package MyGame;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by chengzhicai on 2016/10/23.
 */
public class MyFrame extends Frame {

    public void launchFrame() {
        setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        setLocation(400, 100);//
        setVisible(true);

        new PaintTherad().start();//启动重画线程

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    /**
     * 定义一个重画窗口的线程类，是一个内部类
     *
     * @author chengzhicai
     */
    class PaintTherad extends Thread {
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(50);//括号内表示毫秒，1s=1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
