package classes;

import classes.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2dam
 */
public class ClientSocket {

    static final String HOST = "localhost";
    static final int PUERTO = 5000;
     Message msgEnvio = new Message();
 Message msgRecibo = new Message();
    ClientSocket(Message message) {
        msgEnvio = message;
    }

    ClientSocket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Message sendRecieve(Message mesg) throws IOException {
        try {

            //ENVIO
            Socket skCliente = new Socket(HOST, PUERTO);
            OutputStream palServer = skCliente.getOutputStream();
            ObjectOutputStream flujo2 = new ObjectOutputStream(palServer);
            flujo2.writeObject(mesg);
            
            //RECIBO
            
            InputStream aux = skCliente.getInputStream();
            ObjectInputStream flujo = new ObjectInputStream(aux);
            msgRecibo = (Message) flujo.readObject();
            skCliente.close();
                    
       
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return msgRecibo;
    }
    
}
