package ThreadA;

import javax.swing.*;

/*通过Runnable接口创建线程的步骤如下：

1、定义实现Runnable接口的类，并实现该类中的run（）方法。

2、建立一个Thread对象，并将实现的Runnable接口的类的对象作为参数传入Thread类的构造方法。

3、通过Thread类中的start()方法启动线程，并运行。


注：直接调用Thread类或Runnable类对象的run（）方法是无法启动线程的，这只是一个简单的方法调用必须通过Thread方法中的start（）才行。
*/


//线程实现窗口标语循环滚动Demo
public class MyFrameThread extends JFrame implements Runnable {
    JLabel lb;
    int x = 0;
    //JTextField tf;
    MyFrameThread(String s){
        super(s);
        setBounds(0,0,600,400);
     // setLayout(new FlowLayout());
        setLayout(null);

        lb =new JLabel("欢迎学习java！");
        lb.setBounds(x,150,200,50);
        add(lb);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void run(){
        while(true){
            x++;
            x=x%getWidth();
            lb.setBounds(x,150,200,50);
            try {
                Thread.sleep(50);
            }catch(InterruptedException e){
                System.out.println("出错了"+e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
         MyFrameThread mft=new MyFrameThread("学习Runnable");
         Thread t1=new Thread(mft);
         t1.start();
    }
}
