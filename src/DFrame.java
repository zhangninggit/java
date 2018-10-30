import javax.swing.*;
import java.awt.*;

//在图形界面中添加单选框
public class DFrame extends JFrame {
    JLabel lb1,lb2;
    JRadioButton rb11,rb12,rb13,rb21,rb22;
    public DFrame(String s){
        super(s);
        this.setBounds(200,300,400,600);
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        lb1 =new JLabel("请选择科目");
        rb11 = new JRadioButton("数学");
        rb12 = new JRadioButton("英语");
        rb13 = new JRadioButton("物理");
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rb11);
        bg1.add(rb12);
        bg1.add(rb13);
        this.add(lb1);
        this.add(rb11);
        this.add(rb12);
        this.add(rb13);

        lb2 = new JLabel("选择性别");
        rb21 = new JRadioButton("男");
        rb22 = new JRadioButton("女");
        ButtonGroup bg2 = new ButtonGroup();
        this.add(lb2);
        bg2.add(rb21);
        bg2.add(rb22);
        this.add(rb21);
        this.add(rb22);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        new DFrame("单选框");
    }
}
