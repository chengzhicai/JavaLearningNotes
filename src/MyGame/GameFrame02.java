package MyGame;
import java.awt.*;

/**
 * Created by chengzhicai on 2016/10/20.
 */

/**
 * Created by chengzhicai on 2016/10/17.
 */
public class GameFrame02 extends MyFrame {
    Image img = GameUtil.getImage("images/三勾玉写轮眼.jpg");//直接调用

    public static void main(String[] args) {
        GameFrame02 gf = new GameFrame02();
        gf.launchFrame();
    }



    private double x=100, y=100;
    private double degree=3.14/3;
    private double speed=30;

    public void paint(Graphics g) {

        g.drawImage(img, (int) x, (int) y, null);

        if(speed>0){
            speed-=0.1;
        }
        else {
            speed=0;
        }
        x+=speed*Math.cos(degree);
        y+=speed*Math.sin(degree);

        if(y>800||y<100){
            degree=-degree;
        }
        if(x>1000||x<100){
            degree=Math.PI-degree;
        }
    }


}
