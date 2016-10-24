package MyGame;

import java.awt.*;

/**
 * Created by chengzhicai on 2016/10/23.
 */

/**
 * 测试物体沿着椭圆飞行
 * 最后，实现一个小的台球游戏。
 * @author chengzhicai
 *
 */
public class GameFrame03 extends MyFrame {    //GUI编程：AWT,swing等。

    Image img = GameUtil.getImage("images/三勾玉写轮眼.jpg");

    public static void main(String[] args) {
        GameFrame03 gf = new GameFrame03();
        gf.launchFrame();
    }


    /**
     * 加载窗口
     */


    private double x=100,y=100;
    private double degree=3.14/3;    //[0,2pi]
    @Override
    public void paint(Graphics g) {
        g.drawImage(img, (int)x, (int)y, null);

        x =100+ 100*Math.cos(degree);
        y =200+ 50*Math.sin(degree);

        degree +=0.1;

    }

    /**
     * 定义一个重画窗口的线程类，是一个内部类
     * @author chengzhicai
     *
     */
}

