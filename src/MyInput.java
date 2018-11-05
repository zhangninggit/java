import java.io.*;


//文件字节输入流Demo
public class MyInput {
    public static void main(String[] args) throws IOException{
       
            FileInputStream fin = new FileInputStream("D:/MyFrame.java");
            int x = fin.read(); //读取不到数据时返回-1
            while(x!= -1){
                System.out.print((char)x);
                x = fin.read();
            }
            fin.close();
        

    }
}
