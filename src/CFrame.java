import javax.swing.*;
import java.awt.*;

//��ѡ��
public class CFrame extends JFrame {
    JCheckBox cb1,cb2,cb3;
    JLabel lb;
    public CFrame(String s){
        super(s);
        this.setBounds(200,200,500,500);
        this.setLayout(new FlowLayout());
        lb = new JLabel("��ѡ��ϲ������ɫ");
        this.add(lb);
        cb1 = new JCheckBox("��");
        cb2 = new JCheckBox("��");
        cb3 = new JCheckBox("��");

        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args)
    {
        new CFrame("��ѡ��");
    }
}
