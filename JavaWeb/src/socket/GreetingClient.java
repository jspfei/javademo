package socket;

import java.io.*;
import java.net.DatagramPacket;
import java.net.Socket;

/**
 * Created by admin on 2017/4/14.
 */
public class GreetingClient {
    public static void main (String[] args){
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try{
            System.out.println("Connecting to "+serverName
            +" on port "+port);
            Socket client = new Socket(serverName,port);
            System.out.println("Just connected to "
            +client.getRemoteSocketAddress());
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream out =
                    new DataOutputStream(outputStream);
            out.writeUTF("Hello form "
                +client.getLocalSocketAddress());
            InputStream inputStream = client.getInputStream();
            DataInputStream in =
                    new DataInputStream(inputStream);
            System.out.println("Server says "+in.readUTF());
            client.close();
        }catch (IOException o){
            o.printStackTrace();
        }
    }
}
