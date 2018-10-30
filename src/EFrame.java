

import javax.swing.*;
import java.awt.*;

/*
*
* 下拉列表联系
*
* 1.创建窗口容器
* 2.设置窗口属性(大小，位置)
* 3.设置布局
* 4.创建下拉列表组件
* 5.将组件添加到窗口容器中
*
* */
public class EFrame extends JFrame {
        JComboBox cb;
        JLabel lb;
        public EFrame(String s){
            super(s);
            this.setBounds(200,400,500,500);

            lb = new JLabel("选择学习的语言:");
            this.setLayout(new FlowLayout());
            cb = new JComboBox();
            cb.addItem("C");
            cb.addItem("Java");
            cb.addItem("C++");
            cb.addItem("Python");

            this.add(lb);
            this.add(cb);

            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public static void main(String [] args){
            new EFrame("下拉列表");
        }
}
