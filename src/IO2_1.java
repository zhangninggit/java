import java.io.*;

//缓冲流Buffered Demo
public class IO2_1 {
    public static void main(String[] args) throws  IOException{
        FileInputStream fin = new FileInputStream("D:/gongxueyuan.jpg");
        BufferedInputStream bin = new BufferedInputStream(fin);
        FileOutputStream fout = new FileOutputStream("E:/Demo.jpg");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        int x = fin.read();
        while(x!=-1){
            //System.out.println(char(x));
            bout.write(x);
            x = bin.read();
        }
        bout.flush(); //清空缓冲区
        fin.close();
        fout.close();
    }
}
