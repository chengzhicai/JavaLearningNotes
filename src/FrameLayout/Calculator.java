package FrameLayout;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Created by chengzhicai on 2016/10/3.
 */
public class Calculator {
    public static void main(String[] args) {
        new CalculatorFrame();
    }
}



class CalculatorFrame extends JFrame{

    public CalculatorFrame(){
        this.setTitle("计算器");
        CalculatorPanel cp = new CalculatorPanel();
        this.add(cp);
        this.pack();
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}



class CalculatorPanel extends JPanel{
    JLabel display = null;
    JPanel panel = null;
    double result;
    String command;//存放命令
    boolean start;

    public CalculatorPanel(){
        this.setLayout(new BorderLayout());
        result = 0.0;
        command = "=";
        start = true;
        display = new JLabel();
        display.setText("0.0");

        this.add(BorderLayout.NORTH,display);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        CalculatorAction1 c1 = new CalculatorAction1();
        CalculatorAction2 c2 = new CalculatorAction2();
        addButton("7",c1);
        addButton("8",c1);
        addButton("9",c1);
        addButton("+",c2);
        addButton("4",c1);
        addButton("5",c1);
        addButton("6",c1);
        addButton("-",c2);
        addButton("1",c1);
        addButton("2",c1);
        addButton("3",c1);
        addButton("*",c2);
        addButton("0",c1);
        addButton(".",c1);
        addButton("=",c2);
        addButton("/",c2);
        this.add(BorderLayout.CENTER,panel);
    }

    private void addButton(String s,ActionListener al){
        JButton button=new JButton(s);
        button.addActionListener(al);
        panel.add(button);
    }

    //数字的监听器
    class CalculatorAction1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String input=e.getActionCommand();
            if(start){
                display.setText("");
                start=false;
            }
            display.setText(display.getText()+input);
        }

    }

    //操作命令的监听器
    class CalculatorAction2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String c=e.getActionCommand();
            if(start){
                command=c;
            }else{
                if(command.equals("+")){
                    result+=Double.parseDouble(display.getText());
                }else if(command.equals("-")){
                    result-=Double.parseDouble(display.getText());
                }else if(command.equals("*")){
                    result*=Double.parseDouble(display.getText());
                }else if(command.equals("/")){
                    result/=Double.parseDouble(display.getText());
                }else if(command.equals("=")){
                    result=Double.parseDouble(display.getText());
                }
                display.setText(""+result);
                command=c;
                start=true;
            }
        }

    }

}
