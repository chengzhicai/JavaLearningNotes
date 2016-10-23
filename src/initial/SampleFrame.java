package initial;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by chengzhicai on 2016/9/19.
 */
public class SampleFrame extends JFrame{

    public SampleFrame(){
        this.setSize(800,600);
        this.setVisible(true);//括号内默认值是false,

        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new SampleFrame();
    }
}
