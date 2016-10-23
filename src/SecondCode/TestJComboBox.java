package SecondCode;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/28.
 */
public class TestJComboBox {
    public static void main(String[] args) {
        new MyFrame4();
    }
}
//窗体类MyFrame继承了JFrame类，实现了ItemListener接口
class  MyFrame4 extends JFrame implements ItemListener {
    JPanel jp = new JPanel();
    JComboBox jcb = new JComboBox();
    JLabel label = new JLabel();

    public MyFrame4(){
        //给下拉列表增加元素
        jcb.addItem("java");
        jcb.addItem("php");
        jcb.addItem("c++");
        jcb.addItemListener(this);
        //把控件添加到面板中
        jp.add(jcb);
        jp.add(label);
        this.add(jp);

        this.setTitle("下拉列表JComboBox使用");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setSize(800,500);
        this.setVisible(true);

    }

    public void itemStateChanged(ItemEvent e){
        label.setText(e.getItem().toString());//获取标签信息，并且被强制转换为字符串
                      //括号中也可以是：(String)e.getItem()
    }
}