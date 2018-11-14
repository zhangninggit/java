package Socket;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器正在运行......");
        ServerSocket server=new ServerSocket(10009);
        while(true){
            Socket sk=server.accept(); //监听来自客户端的连接请求  accept()方法监听客户端请求

            InputStream in=sk.getInputStream();
            InputStreamReader ir = new InputStreamReader(in);

            OutputStream out = sk.getOutputStream();
            OutputStreamWriter ow =new OutputStreamWriter(out);

            BufferedReader br=new BufferedReader(ir);

            BufferedWriter bw=new BufferedWriter(ow);
            String s=br.readLine();
            bw.write(s+"你好");
            bw.newLine();
            bw.flush();
            out.close();
            sk.close();

        }

    }
}
