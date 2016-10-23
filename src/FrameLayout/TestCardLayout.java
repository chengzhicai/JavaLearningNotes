package FrameLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.JPanel;


/**
 * Created by chengzhicai on 2016/10/1.
 */
public class TestCardLayout extends JFrame implements ActionListener{

    public static void main(String[] args) {
        new TestCardLayout();
    }

    JPanel jp1,jp2;
    JButton jbt1,jbt2,jbt3;
    JLabel jl1,jl2,jl3;

    public TestCardLayout(){
        jp1 = new JPanel();
        jbt1 = new JButton("按钮1");
        jbt2 = new JButton("按钮2");
        jbt3 = new JButton("按钮3");

        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        jbt3.addActionListener(this);

        jp1.setLayout(new FlowLayout());
        jp1.add(jbt1);
        jp1.add(jbt2);
        jp1.add(jbt3);

        jp2 = new JPanel();//面板2用来放置三个标签，并且是卡片布局
        jp2.setLayout(new CardLayout());
        jl1 = new JLabel(new ImageIcon(
                "G:\\landscape image\\ae65f47c04d88c62177f95ff0b8eb262.jpg"));
        jl2 = new JLabel(new ImageIcon(
                "G:\\landscape image\\c30b9c826a36e895b3f40a8bc1371721.jpg"));
        jl3 = new JLabel(new ImageIcon(
                "G:\\landscape image\\d5f5e0c4782d9ef705bc0a2db49728bd.jpg"));

        jp2.add("label1",jl1);
        jp2.add("label2",jl2);
        jp2.add("label3",jl3);

        this.setLayout(new BorderLayout());
        this.add(BorderLayout.NORTH,jp1);
        this.add(BorderLayout.CENTER,jp2);

        this.setTitle("卡片布局CardLayout");
        this.setSize(800,500);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==jbt1){
            //按钮1被点击，则显示第一个Label
            ((CardLayout)jp2.getLayout()).show(jp2,"label1");
        }else if(e.getSource()==jbt2){
            ((CardLayout)jp2.getLayout()).show(jp2,"label2");
        }else if(e.getSource()==jbt3){
            ((CardLayout)jp2.getLayout()).show(jp2,"label3");
        }
    }

}
