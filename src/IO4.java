
import java.io.*;


/*
*  1、计算机存储的单位是字节，如尽管txt文本中有中文汉字这样的字符，但是对计算机而言，其是字节形式存在的

   2、字节流读取是单字节读取，但是不同字符集解码成字符需要不通过个数，因此字节流读取会报错

   3、 那么就需要一个流把字节流读取的字节进行缓冲而后在通过字符集解码成字符返回，因而形式上看是字符流

   4、InputStreamReader流就是起这个作用，实现从字节流到字符流的转换
*
* */
public class IO4 {
    public static void main(String[] args) throws IOException{
        InputStreamReader Ir = new InputStreamReader(System.in); //该语句可用做键盘输入数据
        BufferedReader br = new BufferedReader(Ir);
        String s = null;
        System.out.println("输入一个实数:");
        s=br.readLine();
        double x= Double.parseDouble(s);
        System.out.println("再输入一个实数:");
        s=br.readLine();
        double y= Double.parseDouble(s);
        System.out.println(x+"+"+y+"="+(x+y));
    }
}
