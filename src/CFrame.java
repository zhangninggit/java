import javax.swing.*;
import java.awt.*;

//¸´Ñ¡¿ò
public class CFrame extends JFrame {
    JCheckBox cb1,cb2,cb3;
    JLabel lb;
    public CFrame(String s){
        super(s);
        this.setBounds(200,200,500,500);
        this.setLayout(new FlowLayout());
        lb = new JLabel("ÇëÑ¡ÔñÏ²»¶µÄÑÕÉ«");
        this.add(lb);
        cb1 = new JCheckBox("ºì");
        cb2 = new JCheckBox("ÂÌ");
        cb3 = new JCheckBox("À¶");

        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args)
    {
        new CFrame("¸´Ñ¡¿ò");
    }
}
