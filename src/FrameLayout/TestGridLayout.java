package FrameLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/28.
 */
//网格布局GridLayout
public class TestGridLayout extends JFrame{
    public static void main(String[] args) {
        new TestGridLayout();
    }

    public TestGridLayout(){
        this.setTitle("网格布局GridLayout");
        this.setSize(800,600);
        GridLayout gl = new GridLayout(3,3,10,10);
        this.setLayout(gl);
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
