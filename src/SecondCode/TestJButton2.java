package SecondCode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/26.
 */
public class TestJButton2{
    public static void main(String[] args){
        new MyFrame0();
    }
}
//一个事件触发多个按钮
class MyFrame0 extends JFrame {
    JPanel jp = new JPanel();
    JButton jb1 = new JButton("按钮1");
    JButton jb2 = new JButton("按钮2");
    JLabel jl = new JLabel("");

    public MyFrame0() {
        //给两个按钮添加相同的监听器
        MyActionListener mal = new MyActionListener();
        jb1.addActionListener(mal);
        jb2.addActionListener(mal);

        jp.add(jb1);
        jp.add(jb2);
        jp.add(jl);
        this.add(jp);
        this.setSize(800,500);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jb1) {//getSource表示当前被触发的组件是什么
                jl.setText("按钮1被按了");
            } else {
                jl.setText("按钮2被按了");
            }
        }
    }
}