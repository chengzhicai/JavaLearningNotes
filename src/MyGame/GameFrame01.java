/*
package MyGame;


*/
/**
 * 游戏窗口类
 *//*



import java.awt.*;

*/
/**
 * Created by chengzhicai on 2016/10/17.
 *//*



public class GameFrame01 extends MyFrame {
    Image img = GameUtil.getImage("images/三勾玉写轮眼.jpg");//直接调用

    public static void main(String[] args) {
        GameFrame01 gf01 = new GameFrame01();
        gf01.launchFrame();
    }

    private double x, y;
    private boolean left;
    private boolean up;

    public void paint(Graphics g) {


        g.drawImage(img, (int) x, (int) y, null);

        //水平方向
        if (left) {
            x -= 15;
        } else {
            x += 15;
        }
        if (x > 825) {
            left = true;
        }
        if (x < -25) {
            left = false;
        }

        //竖直方向
        if (up) {
            y -= 15;
        } else {
            y += 15;
        }
        if (y > 825) {
            up = true;
        }
        if (y < -25) {
            up = false;
        }

    }
}


*/
