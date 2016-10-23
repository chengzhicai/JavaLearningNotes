package SecondCode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/23.
 */
public class TestJButton {
    public static void main(String[] args){
        new MyJFrame();
    }

}
class MyJFrame extends JFrame{
    JPanel jp = new JPanel();
    JButton jb = new JButton("按钮");
    JLabel jl = new JLabel("");
    int count=1;
    String str = "";
    public MyJFrame(){
        jp.add(jb);
        jp.add(jl);
        this.add(jp);
        this.setTitle("JButton使用");
        this.setSize(800,500);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        jb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                jl.setText("这是第"+(count++)+"次按下按钮");
                if(count > 20){
                    System.exit(0);
                }
//                str+="先注册的监听器";
//                jl.setText(str);
            }

        });
//        jb.addActionListener(new ActionListener(){
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // TODO Auto-generated method stub
//                //jl.setText("这是第"+(count++)+"次按下按钮");
//                str+="后注册的监听器";
//                jl.setText(str);
//            }
//
//        });
    }
}
