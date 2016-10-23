package SecondCode;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/21.
 */
class MyFrame6 extends JFrame {
    public MyFrame6() {
        this.setTitle("窗体");
        this.setSize(800, 500);
        this.setVisible(true);
        this.addWindowListener(new MyWindowAdapter());

    }

    public static void main(String[] args) {
        new MyFrame6();
    }

    class MyWindowAdapter extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.print("被关闭");
            System.exit(0);
        }

        public void windowOpened(WindowEvent e) {
            System.out.println("被打开");
        }
    }
}