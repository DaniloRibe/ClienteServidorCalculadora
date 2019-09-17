/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danilo
 */
public class TCPClient {
    
    int serverPort = 6789;
    String ip = "localhost";
    Socket s;
    DataInputStream in;
    DataOutputStream out;
    
    public void sendRequest(String request){
        try {
            s = new Socket(ip, serverPort);
            out = new DataOutputStream(s.getOutputStream());
            out.writeUTF(request);
            
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getResponse(){
        String data = null;
        try {
            in = new DataInputStream(s.getInputStream());
            data = in.readUTF();
            
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public void close(){
        try {
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
