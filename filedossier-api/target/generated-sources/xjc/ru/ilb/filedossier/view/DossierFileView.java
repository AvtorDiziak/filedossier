
package ru.ilb.filedossier.view;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Файл досье
 * 
 * <p>Java class for dossierFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dossierFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="readonly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dossierFile", propOrder = {
    "code",
    "name",
    "exists",
    "readonly",
    "required"
})
@XmlRootElement(name = "dossierFile")
public class DossierFileView
    implements Serializable
{

    /**
     * Код файла
     * 
     */
    @XmlElement(required = true)
    protected String code;
    /**
     * Наименование
     * 
     */
    @XmlElement(required = true)
    protected String name;
    /**
     * Наличие файла
     * 
     */
    protected boolean exists;
    /**
     * Только для чтения
     * 
     */
    protected boolean readonly;
    /**
     * Обязательный
     * 
     */
    protected boolean required;

    /**
     * Gets the value of the code property.
     * <p>
     * Код файла
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
     * Наименование
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
     * Gets the value of the exists property.
     * <p>
     * Наличие файла
     * 
     */
    public boolean isExists() {
        return exists;
    }

    /**
     * Sets the value of the exists property.
     * 
     * @see #isExists()
     */
    public void setExists(boolean value) {
        this.exists = value;
    }

    /**
     * Gets the value of the readonly property.
     * <p>
     * Только для чтения
     * 
     */
    public boolean isReadonly() {
        return readonly;
    }

    /**
     * Sets the value of the readonly property.
     * 
     * @see #isReadonly()
     */
    public void setReadonly(boolean value) {
        this.readonly = value;
    }

    /**
     * Gets the value of the required property.
     * <p>
     * Обязательный
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @see #isRequired()
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    public DossierFileView withCode(String value) {
        setCode(value);
        return this;
    }

    public DossierFileView withName(String value) {
        setName(value);
        return this;
    }

    public DossierFileView withExists(boolean value) {
        setExists(value);
        return this;
    }

    public DossierFileView withReadonly(boolean value) {
        setReadonly(value);
        return this;
    }

    public DossierFileView withRequired(boolean value) {
        setRequired(value);
        return this;
    }

}
