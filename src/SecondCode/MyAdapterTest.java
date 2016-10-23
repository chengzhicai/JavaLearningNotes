package SecondCode;

/**
 * Created by chengzhicai on 2016/9/22.
 */




        import java.awt.BorderLayout;
        import java.awt.Button;
        import java.awt.Frame;
        import java.awt.Label;
        import java.awt.TextField;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;
        import java.sql.Date;

class MyButtonListener2 implements ActionListener
{
    // 因为ActionListener只有一个方法，所以没有适配器

    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // 输出信息
        System.out.println("The Button is pressed!");

        // 输出时间戳
        Long time = e.getWhen();
        System.out.println("timestamp: " + time);

        // 日期时间
        Date date = new Date(time);
        System.out.println(date.toLocaleString());

    }

}

class MyWindowListener2 extends WindowAdapter
{
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.out.println("windowClosing");
        // 退出
        System.exit(0);
    }

}
