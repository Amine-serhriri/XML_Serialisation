package de.fhac.kosy.client;

import jakarta.xml.bind.JAXBException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class XMLEchoClient {
    public static void main(String[] args) throws UnknownHostException, IOException, JAXBException {
        System.out.println("client starts");
        Socket socket = new Socket("localhost", 5678);

        String senderName = socket.getLocalAddress().getHostName();
        //TODO: XMLSerialisation-Objekt initialisieren

        Scanner scanner = new Scanner(System.in);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        while (scanner.hasNextLine()) {
            //TODO: EchoMessage erstellen & Content setzen und als XML verschicken
            //TODO: vice versa
            //TODO: Ausgabe von Sender und Content
        }
        scanner.close();
        socket.close();
    }
}
