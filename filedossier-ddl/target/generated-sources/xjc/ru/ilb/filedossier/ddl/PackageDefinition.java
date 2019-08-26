
package ru.ilb.filedossier.ddl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Пакет досье
 * 
 * <p>Java class for package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="package"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:ru:ilb:filedossier:ddl}dossier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "package", propOrder = {
    "code",
    "name",
    "dossiers"
})
@XmlRootElement(name = "package")
public class PackageDefinition
    implements Serializable
{

    /**
     * код пакета
     * 
     */
    @XmlElement(required = true)
    protected String code;
    /**
     * Наименование пакета
     * 
     */
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "dossier")
    protected List<DossierDefinition> dossiers;

    /**
     * Gets the value of the code property.
     * <p>
     * код пакета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * <p>
     * Наименование пакета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Досье Gets the value of the dossiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dossiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDossiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DossierDefinition }
     * 
     * 
     */
    public List<DossierDefinition> getDossiers() {
        if (dossiers == null) {
            dossiers = new ArrayList<DossierDefinition>();
        }
        return this.dossiers;
    }

    public void setDossiers(List<DossierDefinition> value) {
        this.dossiers = value;
    }

    public PackageDefinition withCode(String value) {
        setCode(value);
        return this;
    }

    public PackageDefinition withName(String value) {
        setName(value);
        return this;
    }

    public PackageDefinition withDossiers(DossierDefinition... values) {
        if (values!= null) {
            for (DossierDefinition value: values) {
                getDossiers().add(value);
            }
        }
        return this;
    }

    public PackageDefinition withDossiers(Collection<DossierDefinition> values) {
        if (values!= null) {
            getDossiers().addAll(values);
        }
        return this;
    }

    public PackageDefinition withDossiers(List<DossierDefinition> value) {
        setDossiers(value);
        return this;
    }

}
