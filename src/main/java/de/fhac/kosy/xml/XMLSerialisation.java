package de.fhac.kosy.xml;

import de.fhac.kosy.xml.generated.EchoMessage;
import de.fhac.kosy.xml.generated.ObjectFactory;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;


public class XMLSerialisation {
    private ObjectFactory of;
    private JAXBContext jc;
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;
    private String sender;
    

    /**
     * Erstellt ein XMLSerialisation-Objekt, welches ein EchoMessage-Objekt in einen XML-String
     * serialisiert/deserialisiert
     * <p>
     * In der Methode werden die Klassenparameter initialisiert. Ausserdem wird der
     * formatierte Output zur besseren Lesbarkeit eingeschaltet.
     *
     * @param sender Sendername
     * @see JAXBContext, marshaller, unmarshaller
     */
    public XMLSerialisation(String sender) throws JAXBException, JAXBException {
        // TODO initialize class-member
        jc= JAXBContext.newInstance(EchoMessage.class);

        marshaller= jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

        unmarshaller=jc.createUnmarshaller();

        this.sender=sender;


    }

    /**
     * Serialisiert das Objekt in die XML-Repraesentation.
     *
     * @param message Object das serialisiert werden soll
     * @return die XML-Repraesentation des Objekts als String
     * @see StringWriter, Marshaller.marshall()
     */
    public String messageToXMLString(EchoMessage message) throws JAXBException {
        // TODO message->XML
        StringWriter stringWriter=new StringWriter();
        marshaller.marshal(message,stringWriter);
        String result=stringWriter.toString();
        return result;
    }

    public EchoMessage getNewMessage() {
        // TODO EchoMessage aus ObjectFactory erzeugen, Sender und Type setzen

        return null;
    }

    /**
     * Deserialisiert von einem XML-String ein Objekt aus dem JAXBContext
     *
     * @param xml XML-Repraesentation eines EchoMessage-Objekts
     * @return EchoMessage-Object
     * @throws JAXBException
     * @see StringReader, Unmarshaller.unmarshall()
     */
    public EchoMessage xmlStringToMessage(String xml) throws JAXBException {
        // TODO XML->message
        EchoMessage result=(EchoMessage) unmarshaller.unmarshal(new StringReader(xml));
        return result;
    }
}
