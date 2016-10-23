package initial;

import javax.swing.*;
import java.awt.*;

/**
 * Created by chengzhicai on 2016/9/20.
 */
public class MyPanel extends JPanel {
    public MyPanel(){
        this.add(new JButton("这是画板上的一个按钮"));
    }
    //绘制组件
    public void paintComponent(Graphics g){
            g.drawString("这是面板上的内容",100,100);
    }
}
