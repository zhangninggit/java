package SocketA;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {

    public static void main(String[] args) throws IOException {
        Socket s= new Socket("127.0.0.1",10007);
        OutputStream out = s.getOutputStream();
        out.write("dajiahao".getBytes());
        s.close();
    }
}
