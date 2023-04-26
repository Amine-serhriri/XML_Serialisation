package de.fhac.kosy.server;

import jakarta.xml.bind.JAXBException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class XMLEchoServer {
    public static void main(String[] args) throws IOException, JAXBException {
        System.out.println("server starts");
        ServerSocket serverSocket = new ServerSocket(5678);
        Socket socket = serverSocket.accept();

        String senderName = socket.getInetAddress().getHostName();
        //TODO: XMLSerialisation-Objekt initialisieren

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        while (true) {
            //TODO: XML einlesen und daraus EchoMessage mit UpperCase-Content erstellen
            //TODO: vice versa
        }
    }
}
