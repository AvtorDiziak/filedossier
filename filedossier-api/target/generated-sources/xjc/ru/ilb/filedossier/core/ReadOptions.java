
package ru.ilb.filedossier.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * read options
 * 
 * <p>Java class for readOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="readOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WITH_DOSSIERFILE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "readOptions", namespace = "urn:ru:ilb:filedossier:core")
@XmlEnum
public enum ReadOptions {


    /**
     * with dossierfile
     * 
     */
    WITH_DOSSIERFILE;

    public String value() {
        return name();
    }

    public static ReadOptions fromValue(String v) {
        return valueOf(v);
    }

}
