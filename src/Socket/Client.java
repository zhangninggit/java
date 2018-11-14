package Socket;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1",10009);

        InputStream in=sk.getInputStream();
        InputStreamReader ir = new InputStreamReader(in);

        OutputStream out = sk.getOutputStream();
        OutputStreamWriter ow =new OutputStreamWriter(out);

        BufferedReader br=new BufferedReader(ir);

        BufferedWriter bw=new BufferedWriter(ow);

        BufferedReader kr =new BufferedReader(new InputStreamReader(System.in));
        String s1,s2;
        do{
            System.out.println("Client saya:");
            s1=kr.readLine();
            bw.write(s1);
            bw.newLine();
            bw.flush();
            s2=br.readLine();
            System.out.println("Server say:"+s2);
        }while(!s1.equals("BYE"));
            in.close();
            out.close();
            sk.close();

        //String s=br.readLine();
        //bw.write(s+"你好");
        //bw.newLine();
        //bw.flush();
        //out.close();
        //sk.close();
    }
}
