/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despachante;

import esqueleto.Esqueleto;

/**
 *
 * @author danilo
 */
public class Despachante {
    
    public String invoke(String messege){
        String mensagem [] = messege.split(",");
        String response = null;
        Esqueleto e = new Esqueleto();
        switch(mensagem[0]){
            case "add":
                response = e.add(mensagem[0]+","+mensagem[1]+","+mensagem[2]);              
                break;
            case "sub":
                response = e.sub(mensagem[0]+","+mensagem[1]+","+mensagem[2]);
                break;
            case "mult":
                response = e.mult(mensagem[0]+","+mensagem[1]+","+mensagem[2]);
                break;
            case "div":
                response = e.div(mensagem[0]+","+mensagem[1]+","+mensagem[2]);
                break;
            default:
                break;
        }    
        return response;
    }
    
}
