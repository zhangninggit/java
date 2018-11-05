package Thread;

public class A extends Thread{
    public void run(){
        for (int i = 0; i<20; i++){
            System.out.println("要自由!");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("出错了:"+e.getMessage());
            }
        }
    }
}
