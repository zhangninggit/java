package Thread;

public class B extends Thread{
    public void run(){
        for (int i = 0; i<20; i++){
            System.out.println("         要和平!");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("出错了:"+e.getMessage());
            }
        }
    }
}
