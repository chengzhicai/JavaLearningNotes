package SecondCode;

import javax.swing.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/22.
 */
public class TestJLabel extends JFrame{
    public TestJLabel(){
        this.setTitle("标签的使用");
        this.setSize(1200,900);

        Icon image = new ImageIcon("C:\\Users\\ZhiCai\\Desktop\\1.jpg");
        JLabel label = new JLabel(image);//JLabel作用是展示信息
        this.add(label);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
    public static void main(String[] args){
        new TestJLabel();
    }
}
