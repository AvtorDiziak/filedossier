
package ru.ilb.filedossier.view;

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
 * Досье
 * 
 * <p>Java class for dossier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dossier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:ru:ilb:filedossier:view}dossierFile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dossier", propOrder = {
    "code",
    "name",
    "valid",
    "dossierFiles"
})
@XmlRootElement(name = "dossier")
public class DossierView
    implements Serializable
{

    /**
     * код досье
     * 
     */
    @XmlElement(required = true)
    protected String code;
    /**
     * Наименование досье
     * 
     */
    @XmlElement(required = true)
    protected String name;
    /**
     * Валидность досье
     * 
     */
    @XmlElement(required = true)
    protected String valid;
    @XmlElement(name = "dossierFile")
    protected List<DossierFileView> dossierFiles;

    /**
     * Gets the value of the code property.
     * <p>
     * код досье
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
     * Наименование досье
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
     * Gets the value of the valid property.
     * <p>
     * Валидность досье
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValid()
     */
    public void setValid(String value) {
        this.valid = value;
    }

    /**
     * Файлы досье Gets the value of the dossierFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dossierFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDossierFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DossierFileView }
     * 
     * 
     */
    public List<DossierFileView> getDossierFiles() {
        if (dossierFiles == null) {
            dossierFiles = new ArrayList<DossierFileView>();
        }
        return this.dossierFiles;
    }

    public void setDossierFiles(List<DossierFileView> value) {
        this.dossierFiles = value;
    }

    public DossierView withCode(String value) {
        setCode(value);
        return this;
    }

    public DossierView withName(String value) {
        setName(value);
        return this;
    }

    public DossierView withValid(String value) {
        setValid(value);
        return this;
    }

    public DossierView withDossierFiles(DossierFileView... values) {
        if (values!= null) {
            for (DossierFileView value: values) {
                getDossierFiles().add(value);
            }
        }
        return this;
    }

    public DossierView withDossierFiles(Collection<DossierFileView> values) {
        if (values!= null) {
            getDossierFiles().addAll(values);
        }
        return this;
    }

    public DossierView withDossierFiles(List<DossierFileView> value) {
        setDossierFiles(value);
        return this;
    }

}
