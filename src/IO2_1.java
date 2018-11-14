import java.io.*;

/**?
 在java输入输出流中，BufferedReader没有flush方法，BufferedWriter有flush方法；
 这是因为flush方法的作用和功能是向外做输出，将内存中的数据提交输出到外部文件当中，
 在BufferedWriter中，因为是对外做写操作，因此是有提交输出的flush方法的；
 而在BufferedReader对象中，因为它的作用是用来从外部读取文件内容到内存中，
 因此不存在向外做提交输出的操作，因此没有flush方法。

 * */


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
