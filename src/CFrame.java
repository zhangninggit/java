import javax.swing.*;
import java.awt.*;

//复选框
public class CFrame extends JFrame {
    JCheckBox cb1,cb2,cb3;
    JLabel lb;
    public CFrame(String s){
        super(s);
        this.setBounds(200,200,500,500);
        this.setLayout(new FlowLayout());
        lb = new JLabel("请选择喜欢的颜色");
        this.add(lb);
        cb1 = new JCheckBox("红");
        cb2 = new JCheckBox("绿");
        cb3 = new JCheckBox("蓝");

        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args)
    {
        new CFrame("复选框");
    }
}
