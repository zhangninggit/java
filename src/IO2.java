import java.io.*;


//字节输入输出流结合使用Demo
public class IO2 {
    public static void main(String[] args) throws IOException{
        FileInputStream fin = new FileInputStream("D:/gongxueyuan.jpg");
        FileOutputStream fout = new FileOutputStream("E:/Demo.jpg");
        int x = fin.read();
        while(x!=-1){
            fout.write(x);
            x = fin.read();
        }
        System.out.println("复制完成！");
        fin.close();
        fout.close();
    }
}
