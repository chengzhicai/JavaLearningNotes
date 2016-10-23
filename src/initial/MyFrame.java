package initial;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/20.
 */
public class MyFrame extends JFrame {
    public MyFrame(){
        //（父类）创建面板对象
        JPanel p1 = new JPanel();
        //（子类）创建面板对象
        MyPanel p2 =new MyPanel();
        p1.add(p2);//将面板p2添加到面板p1
        this.add(p1);//将面板添加到当前窗体中
        this.setSize(800,600);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new MyFrame();
    }
}
