package FrameLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/28.
 */
//流式布局
public class TestFlowLayout extends JFrame {
    public static void main(String[] args) {
        new TestFlowLayout();
    }

        public TestFlowLayout(){

            JPanel jp = new JPanel();
//            FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
            FlowLayout fl = new FlowLayout();//不写默认为FlowLayout.CENTER居中
//            FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
            jp.setLayout(fl);//为面板jp设置布局

            jp.add(new JButton("以后的以后"));
            jp.add(new JButton("逆流成河"));
            jp.add(new JButton("如果这都不算爱"));
            jp.add(new JButton("平凡之路"));
            jp.add(new JButton("曹操"));

            this.add(jp);
            this.setTitle("流式布局");
            this.setSize(800,500);
            this.setVisible(true);

            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }

}


