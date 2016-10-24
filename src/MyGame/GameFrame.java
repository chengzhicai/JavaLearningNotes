
package MyGame;



/**
 * 游戏窗口类
 */




import java.awt.Font;
import java.awt.*;




/**
 * Created by chengzhicai on 2016/10/17.
 */


public class GameFrame extends MyFrame {
    Image img = GameUtil.getImage("images/三勾玉写轮眼.jpg");//直接调用

    public static void main(String[] args) {
        GameFrame gf = new GameFrame();
        gf.launchFrame();
    }

    private double x, y;

    public void paint(Graphics g) {
        System.out.println("使用了一次线程");
        g.drawLine(0, 0, 900, 900);//drawLine直线
        g.drawRect(200, 100, 400, 400);//drawRect矩形
        g.drawOval(200, 100, 400, 400);//drawOval

        Font f = new Font("宋体", Font.BOLD, 100);
        g.setFont(f);

        g.drawString("我是程志才", 200, 400);

        g.setColor(Color.blue);
        g.fillRect(200, 100, 40, 40);

        Color c = g.getColor();
        g.setColor(Color.red);
        g.fillOval(600, 500, 40, 40);
        g.setColor(c);

        g.drawImage(img, (int) x, (int) y, null);

        x += 3;
        y += 3;
    }
}


