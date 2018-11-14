package SocketA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10007);

        Socket s = ss.accept();

        String a = s.getInetAddress().getHostAddress();

        InputStream in = s.getInputStream();
        InputStreamReader ir = new InputStreamReader(in);

        BufferedReader bf = new BufferedReader(ir);

        String str;
        str = bf.readLine();

        System.out.println(str+" "+s);
        //str = in.read();
    }
}
