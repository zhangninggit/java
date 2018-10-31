import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//这是监听事件的Demo
public class MyFrame2 extends JFrame{
    JTextField tf1,tf2;
    JButton bt;
    Handler hd;
    public MyFrame2(String s){
        super(s);
        this.setBounds(10,20,250,300);
        setLayout(new FlowLayout());
        tf1 = new JTextField(20);
        bt = new JButton("copy");
        tf2 = new JTextField(20);
        this.add(tf1);
        this.add(bt);
        this.add(tf2);
        hd = new Handler();
        bt.addActionListener(hd);
        //this.add(tf1);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s=tf1.getText();
            tf2.setText(s);
            tf1.setText("");
        }
    }

    public static void main(String[] args) {
        new MyFrame2("监听事件");
    }
}
