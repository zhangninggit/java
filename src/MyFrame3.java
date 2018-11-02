import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//获取鼠标的位置，设置一个监听事件
public class MyFrame3 extends JFrame{
    JTextField tf;
    Handler hd;

    MyFrame3(String s){
        super(s);
        setBounds(0,0,400,400);
        tf =new JTextField(20);
        setLayout(new FlowLayout());
        add(tf);
        hd =new Handler();
        addMouseMotionListener(hd);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Handler implements MouseMotionListener{
        public void mouseMoved(MouseEvent e){

        }

        public void mouseDragged(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            tf.setText("x:"+x+"   "+"y:"+y);
        }
    }

    public static void main(String[] args) {
        new MyFrame3("获取鼠标坐标");
    }
}
