import javax.swing.*;
import java.awt.*;


class MyFrame  extends JFrame{
    JLabel lb;
    JTextField tf;
    MyFrame(String s)
    {
        super(s);
        this.setBounds(100,80,600,400);
        lb = new JLabel("用户名");
        tf = new JTextField(10);
        FlowLayout fl =new FlowLayout();
        this.setLayout(fl);
        this.add(lb);
        this.add(tf);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        MyFrame window1 = new MyFrame("我的第一个窗口程序");
    }
}
