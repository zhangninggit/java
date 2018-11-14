package SocketB;

/*
需求：定义端点接收数据并打印在控制台上。

服务端：
1，建立服务端的socket服务。ServerSocket();并监听一个端口

2,获取连接过类的客户端对象。
	通过ServerSocket的accept方法。没有连接就会等，所以这个方法是阻塞式的
3，客户端如果发送过来数据，那么服务端要使用对应的客户端对象，并获取到该客户端对象的读取流
	来读取发过来的数据。并打印在控制台上
4, 关闭服务端（可选操作）
*/

import java.io.*;
import java.net.*;


class Server{
    public static void main(String []  args) throws IOException{
        //建立服务端的Socket服务，并监听一个端口。
        ServerSocket ss = new  ServerSocket(10009);

        //通过ServerSocket的accept方法，获取客户端连接过来的对象。

        Socket s = ss.accept();

        //获取发送数据的客户端主机ip地址
        String ip = s.getInetAddress().getHostAddress();

        //获取客户端发过来的数据，要使用客户端的对象的读取流方法来读取数据

        InputStream in = s.getInputStream();

        //字节流转换为字符流
        InputStreamReader ir = new InputStreamReader(in);

        //添加缓冲区
        BufferedReader bf = new BufferedReader(ir);

        String a = bf.readLine();
        //byte[] buf=new byte[1024];
        //int a = in.read(buf);


        System.out.print(a+"\n "+ip);

        //System.out.println(new String(buf,0,a)+" "+ip);
    }
}
