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
	 * @param message
	 *            Object das serialisiert werden soll
	 * @return die XML-Repraesentation des Objekts als String
	 * @see StringWriter, Marshaller.marshall()
	 */
	String messageToXMLString(EchoMessage message) throws JAXBException {
		// TODO message->XML
		return "";
	}

	EchoMessage getNewMessage() {
		EchoMessage em = of.createEchoMessage();
		em.setSender(sender);
		em.setType(EchoMessageType.DEFAULT);
		return em;
	}

	/**
	 * Deserialisiert von einem XML-String ein Objekt aus dem JAXBContext
	 * 
	 * @param xml
	 *            XML-Repraesentation eines EchoMessage-Objekts
	 * @return EchoMessage-Object
	 * @throws JAXBException
	 * @see StringReader, Unmarshaller.unmarshall()
	 */
	EchoMessage xmlStringToMessage(String xml) throws JAXBException {
		// TODO XML->message
		return null;
	}
}
