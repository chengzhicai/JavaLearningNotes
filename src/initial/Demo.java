package initial;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/18.
 */
public class Demo extends JFrame{
    //创建一些Swing的组件
    JMenuBar jmb = new JMenuBar();//菜单栏
    JMenu jm = new JMenu("文件");//菜单
    JMenu jm0 = new JMenu("编辑");//菜单
    JMenuItem jmi1 = new JMenuItem("打开");//文件选项
    JMenuItem jmi2 = new JMenuItem("保存");//文件选项
    JMenuItem jmi3 = new JMenuItem("项目");//文件选项
    JMenuItem jmi4 = new JMenuItem("撤销");//文件选项
    JMenuItem jmi5 = new JMenuItem("剪切");
    JMenuItem jmi6 = new JMenuItem("复制");

    //使用AWT的Label
    //对象是一个可在容器中放置文本的组件。一个标签只显示一行只读文本。文本可由应用程序更改，但是用户不能直接对其进行编辑。    例如，代码……
    JLabel label=new JLabel("演示AWT和Swing组件之间的遮挡");

    public Demo(){
        //设置布局管理器
        this.setLayout(null);//null位默认的布局管理器
        jm.add(jmi1);
        jm.add(jmi2);
        jm.add(jmi3);
        jm0.add(jmi4);
        jm0.add(jmi5);
        jm0.add(jmi6);
        jmb.add(jm);
        jmb.add(jm0);
        this.setJMenuBar(jmb);//把菜单栏添加到窗体内
        label.setBounds(10,10,300,500);
        this.add(label);
        this.setBounds(300,200,400,350);//this当前
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.setVisible(true);//设置可见性
    }
    public static void main(String[] args){
        new Demo();
    }
}

