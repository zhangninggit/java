import javax.swing.*;
import java.awt.*;


public class Example9_1 {
    public static void main(String [] args)
    {
        JFrame window1 = new JFrame("第一个窗口");
        JFrame window2 = new JFrame("第二个窗口");

        window1.setVisible(true);
        window1.setBounds(60,100,200,400);
        Container con =window1.getContentPane();
        con.setBackground(Color.pink);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        window2.setVisible(true);
        window2.setBounds(266,100,200,400);
        window2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
