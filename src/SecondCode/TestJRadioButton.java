package SecondCode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Created by chengzhicai on 2016/9/27.
 */
public class TestJRadioButton {
    public static void main(String[] args) {
        new MyFrame3();
    }
}
//接口 ActionListener  用于接收操作事件的侦听器接口
class MyFrame3 extends JFrame implements ActionListener {

    JPanel jp = new JPanel();
    //添加三个
    JRadioButton jrb1 = new JRadioButton("java");
    JRadioButton jrb2 = new JRadioButton("php");
    JRadioButton jrb3 = new JRadioButton("c++");
    JLabel label = new JLabel();

    public MyFrame3(){
        //添加三个监听器
        jrb1.addActionListener(this);
        jrb2.addActionListener(this);
        jrb3.addActionListener(this);

        jp.add(new JLabel("选择语言："));
        //让三个单选按钮称为一组
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);

        jp.add(jrb1);
        jp.add(jrb2);
        jp.add(jrb3);
        jp.add(label);
        this.add(jp);

        this.setTitle("JRadioButton的使用");
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }

        });
        this.setSize(800,500);
        this.setVisible(true);


    }




    @Override
    public void actionPerformed(ActionEvent e){
        label.setText(e.getActionCommand());
    }
}
