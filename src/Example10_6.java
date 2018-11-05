import java.io.*;


//字符输入流Demo
public class Example10_6 {
    public static void main(String[] args) {
        try {
            FileReader frd = new FileReader("D:/test1.txt");
            int x = frd.read();
            while(x!=-1){
                System.out.print((char) x);
                x = frd.read();
            }
            frd.close();
        }
        catch(IOException e){
            System.out.println("出错了"+e.getMessage());
        }
    }

}
