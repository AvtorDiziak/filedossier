
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
 * Модель файла досье
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
 *         &lt;element name="readonly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="representation" type="{urn:ru:ilb:filedossier:ddl}representation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "readonly",
    "required",
    "hidden",
    "mediaType",
    "representations"
})
@XmlRootElement(name = "dossierFile")
public class DossierFileDefinition
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
     * Только для чтения
     * 
     */
    protected String readonly;
    /**
     * Обязательный файл
     * 
     */
    protected String required;
    /**
     * Скрытый файл
     * 
     */
    protected String hidden;
    /**
     * Тип содержимого
     * 
     */
    @XmlElement(required = true)
    protected String mediaType;
    /**
     * Представления файла
     * 
     */
    @XmlElement(name = "representation")
    protected List<RepresentationDefinition> representations;

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
     * Gets the value of the readonly property.
     * <p>
     * Только для чтения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadonly() {
        return readonly;
    }

    /**
     * Sets the value of the readonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReadonly()
     */
    public void setReadonly(String value) {
        this.readonly = value;
    }

    /**
     * Gets the value of the required property.
     * <p>
     * Обязательный файл
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequired()
     */
    public void setRequired(String value) {
        this.required = value;
    }

    /**
     * Gets the value of the hidden property.
     * <p>
     * Скрытый файл
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHidden()
     */
    public void setHidden(String value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the mediaType property.
     * <p>
     * Тип содержимого
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMediaType()
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the representations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepresentationDefinition }
     * 
     * <p>
     * Представления файла
     * 
     */
    public List<RepresentationDefinition> getRepresentations() {
        if (representations == null) {
            representations = new ArrayList<RepresentationDefinition>();
        }
        return this.representations;
    }

    public void setRepresentations(List<RepresentationDefinition> value) {
        this.representations = value;
    }

    public DossierFileDefinition withCode(String value) {
        setCode(value);
        return this;
    }

    public DossierFileDefinition withName(String value) {
        setName(value);
        return this;
    }

    public DossierFileDefinition withReadonly(String value) {
        setReadonly(value);
        return this;
    }

    public DossierFileDefinition withRequired(String value) {
        setRequired(value);
        return this;
    }

    public DossierFileDefinition withHidden(String value) {
        setHidden(value);
        return this;
    }

    public DossierFileDefinition withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    public DossierFileDefinition withRepresentations(RepresentationDefinition... values) {
        if (values!= null) {
            for (RepresentationDefinition value: values) {
                getRepresentations().add(value);
            }
        }
        return this;
    }

    public DossierFileDefinition withRepresentations(Collection<RepresentationDefinition> values) {
        if (values!= null) {
            getRepresentations().addAll(values);
        }
        return this;
    }

    public DossierFileDefinition withRepresentations(List<RepresentationDefinition> value) {
        setRepresentations(value);
        return this;
    }

}
