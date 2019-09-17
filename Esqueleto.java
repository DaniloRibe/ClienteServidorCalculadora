/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esqueleto;

import calculadora.Calc;

/**
 *
 * @author danilo
 */
public class Esqueleto {
    
    public String add(String args){
        String mensagem[] = args.split(",");
        Calc c = new Calc();
        double n1 = Double.parseDouble(mensagem[1]);
        double n2 = Double.parseDouble(mensagem[2]);
        double resposta = c.add(n1, n2);
        String enviar = Double.toString(resposta);
        return enviar;
    }
    
    public String sub(String args){
        String mensagem[] = args.split(",");
        Calc c = new Calc();
        double n1 = Double.parseDouble(mensagem[1]);
        double n2 = Double.parseDouble(mensagem[2]);
        double resposta = c.sub(n1, n2);
        String enviar = Double.toString(resposta);
        return enviar;
    }
    
    public String mult(String args){
        String mensagem[] = args.split(",");
        Calc c = new Calc();
        double n1 = Double.parseDouble(mensagem[1]);
        double n2 = Double.parseDouble(mensagem[2]);
        double resposta = c.mult(n1, n2);
        String enviar = Double.toString(resposta);
        return enviar;
    }
    
    public String div(String args){
        String mensagem[] = args.split(",");
        Calc c = new Calc();
        double n1 = Double.parseDouble(mensagem[1]);
        double n2 = Double.parseDouble(mensagem[2]);
        double resposta = c.div(n1, n2);
        String enviar = Double.toString(resposta);
        return enviar;
    }
    
}
