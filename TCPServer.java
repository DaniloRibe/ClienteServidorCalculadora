/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import despachante.Despachante;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author danilo
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {

        while(true){
            String mensagem = getRequest();
            sendResponse(mensagem);
        }
    }

    static ServerSocket welcomeSocket;
    static Socket connectionSocket;
    static DataInputStream in;
    static DataOutputStream out;

    public static String getRequest() throws IOException {
        welcomeSocket = new ServerSocket(6789);
        connectionSocket = welcomeSocket.accept();
        in = new DataInputStream(connectionSocket.getInputStream());
        String clientSentence = in.readUTF();
        Despachante d = new Despachante();
        String resposta = d.invoke(clientSentence);
        return resposta;
    }

    public static void sendResponse(String response) throws IOException {
        out = new DataOutputStream(connectionSocket.getOutputStream());
        out.writeUTF(response);
        welcomeSocket.close();
        connectionSocket.close();
    }
}
