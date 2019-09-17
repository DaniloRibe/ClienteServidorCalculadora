/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.Scanner;
import proxy.Proxy;

/**
 *
 * @author danilo
 */
public class User {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Proxy proxy = new Proxy();

        while (true) {
            System.out.println("Operação: ");
            String op = in.nextLine();
            if (op.equals("close")) {
                proxy.close();
                break;
            }
            double n1 = in.nextDouble();
            double n2 = in.nextDouble();
            in.nextLine();

            switch (op) {
                case "add":
                    System.out.println(proxy.add(n1, n2));
                    break;
                case "sub":
                    System.out.println(proxy.sub(n1, n2));
                    break;
                case "mult":
                    System.out.println(proxy.mult(n1, n2));
                    break;
                case "div":
                    System.out.println(proxy.div(n1, n2));
                    break;
                default:
                    break;
            }
        }
    }

}
