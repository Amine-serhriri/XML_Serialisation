package de.fhac.rn.xml;

import de.fhac.rn.xml.generated.EchoMessage;
import de.fhac.rn.xml.generated.EchoMessageType;
import de.fhac.rn.xml.generated.ObjectFactory;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

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
    public XMLSerialisation(String sender) {
        // TODO initialize class-member
    }

    /**
     * Serialisiert das Objekt in die XML-Repraesentation.
     *
     * @param message Object das serialisiert werden soll
     * @return die XML-Repraesentation des Objekts als String
     * @see StringWriter, Marshaller.marshall()
     */
    String messageToXMLString(EchoMessage message) throws JAXBException {
        // TODO message->XML
        return "";
    }

    EchoMessage getNewMessage() {
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
    EchoMessage xmlStringToMessage(String xml) throws JAXBException {
        // TODO XML->message
        return null;
    }
}
