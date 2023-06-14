//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.06.14 à 04:25:32 PM WET 
//


package de.fhac.kosy.xml.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EchoMessageType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <pre>
 * &lt;simpleType name="EchoMessageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="BROADCAST"/&gt;
 *     &lt;enumeration value="EXIT"/&gt;
 *     &lt;enumeration value="SHOWSTAT"/&gt;
 *     &lt;enumeration value="SHOWALLSTAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EchoMessageType")
@XmlEnum
public enum EchoMessageType {

    DEFAULT,
    BROADCAST,
    EXIT,
    SHOWSTAT,
    SHOWALLSTAT;

    public String value() {
        return name();
    }

    public static EchoMessageType fromValue(String v) {
        return valueOf(v);
    }

}
