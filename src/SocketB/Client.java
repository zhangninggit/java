package SocketB;

import java.io.*;
import java.net.*;

class Client{
    public static void main(String [] args) throws IOException{
        //创建客户端的socket服务。指定目的主机和端口
        Socket s = new Socket("127.0.0.1",10009);

        //为了发送数据，应该获取socket流中的输出流
        OutputStream out = s.getOutputStream();

        //将信息转换成字节形式虽网络流发送出去
        out.write("tcp ge men lai le".getBytes());
        //关闭网络流socket
        s.close();

    }
}