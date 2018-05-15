package de.fhac.rn.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import de.fhac.rn.xml.generated.EchoMessage;
import de.fhac.rn.xml.generated.EchoMessageType;
import de.fhac.rn.xml.generated.ObjectFactory;

public class XMLSerialisation {
	private ObjectFactory of;
	private JAXBContext jc;
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;
	private String sender;

	/**
	 * Erstellt ein Serialiser Objekt was ein EchoMessageObject in einen XML-String
	 * serialisiert/deserialisiert
	 * <p>
	 * In der Methode werdern die Klassenparameter intialisiert. Ausserdem wird der
	 * formatierte Output zur besseren Lesbarkeit eingeschaltet.
	 *
	 * @param sender
	 *            an absolute URL giving the base location of the image
	 * @see JAXBContext, marshaller, unmarshaller
	 */
	public XMLSerialisation(String sender) {
		// TODO initialise class-member
	}

	/**
	 * Serialisiert das Object in die XML Repraesentation.
	 *
	 * @param message
	 *            Object das serialisiert werden soll
	 * @return die XML-Repräsentation des Objects als String
	 * @see StringWriter, Marshaller.marshall()
	 */
	String messageToXMLString(EchoMessage message) throws JAXBException {
		// TODO message->XML
		return sender;
	}

	EchoMessage getNewMessage() {
		EchoMessage em = of.createEchoMessage();
		em.setSender(sender);
		em.setType(EchoMessageType.DEFAULT);
		return em;
	}

	/**
	 * Deserialisiert von eine XML-String ein Object aus dem JAXBContext
	 * 
	 * @param xml
	 *            XML-Repraesentation eines ECHO-Message Objectes
	 * @return EchoMessage-Object
	 * @throws JAXBException
	 * @see StringReader, Unmarshaller.unmarshall()
	 */
	EchoMessage xmlStringToMessage(String xml) throws JAXBException {
		// TODO XML->message
		return null;
	}
}
