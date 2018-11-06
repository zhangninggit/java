package ThreadA;

public class A implements Runnable{
    String slogan;  //输入的口号
    long sleepTime; //线程睡眠时间

    A(String s,long t){  //创建一个构造方法
        slogan=s;
        sleepTime=t;
    }
    public void run(){
        for(int i = 0; i<20;i++){
            System.out.println(slogan);
            try
            {
                Thread.sleep(sleepTime);
            }
            catch(InterruptedException e){

                System.out.println("出错了"+e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        A x = new A("要自由",1000);
        A y = new A("        要平等",2000);
        Thread t1 =new Thread(x);
        Thread t2 =new Thread(y);
        t1.start();
        t2.start();
    }
}
