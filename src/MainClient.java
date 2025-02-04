
package com.mycompany.tcpcommunication;

/**
 *
 * @author user
 */
public class MainClient {


    public static void main(String[] args){
        Client c1 = new Client("Alessandro");
        c1.connetti("localhost", 2000);
        c1.scrivi();
        c1.chiudi();
    }
}