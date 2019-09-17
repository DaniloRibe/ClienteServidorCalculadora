/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import tcpclient.TCPClient;

/**
 *
 * @author danilo
 */
public class Proxy {
    TCPClient client = new TCPClient();
    public double add(double n1, double n2){
        String request = "add,"+n1+","+n2;
        client.sendRequest(request);
        String response = client.getResponse();
        double resposta = Double.parseDouble(response);
        return resposta;
    }
    
    public double sub(double n1, double n2){
        String request = "sub,"+n1+","+n2;
        client.sendRequest(request);
        String response = client.getResponse();
        double resposta = Double.parseDouble(response);
        return resposta;
    }
    
    public double mult(double n1, double n2){
        String request = "mult,"+n1+","+n2;
        client.sendRequest(request);
        String response = client.getResponse();
        double resposta = Double.parseDouble(response);
        return resposta;
    }
    
    public double div(double n1, double n2){
        String request = "div,"+n1+","+n2;
        client.sendRequest(request);
        String response = client.getResponse();
        double resposta = Double.parseDouble(response);
        return resposta;
    }
    
    public void close(){
        client.close();
    }
    
}
