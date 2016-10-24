package MyGame;

import java.awt.*;
import java.awt.event.*;



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
