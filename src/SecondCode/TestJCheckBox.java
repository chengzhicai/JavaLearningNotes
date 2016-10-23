package SecondCode;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Created by chengzhicai on 2016/9/27.
 */
public class TestJCheckBox {
    public static void main(String[] args) {
        new MyFrame();
    }
}
class MyFrame extends JFrame implements ItemListener {//这种实现方式真正写代码时是不提倡的，但可以简化代码
    JPanel jp = new JPanel();
    //创建了三个复选框
    JCheckBox cb1 = new JCheckBox("java");
    JCheckBox cb2 = new JCheckBox("php");
    JCheckBox cb3 = new JCheckBox("c++");

    JLabel label = new JLabel();//标签

    public MyFrame() {
        //
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);

        jp.add(new JLabel("选择语言"));
        jp.add(cb1);
        jp.add(cb2);
        jp.add(cb3);
        jp.add(label);
        this.add(jp);
        //以下为必须设置的基础属性
        this.setTitle("JCheckBox的使用");
        this.setSize(800,500);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {//e:当前事件对象，封装了当前事件信息
        {
            JCheckBox cb = (JCheckBox)e.getItem();//e.getItem()触发当前事件的组件，返回值是object，所以加JCheckBox强转
            if(e.getStateChange()==ItemEvent.SELECTED){
                label.setText(label.getText()+cb.getText()+" ");//getText()获取当前被点击的复选框的文本内容
                //+号代表追加不是覆盖
            }
        }
    }
}







