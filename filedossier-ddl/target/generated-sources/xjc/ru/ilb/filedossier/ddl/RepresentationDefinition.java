
package ru.ilb.filedossier.ddl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Преставление файла досье
 * 
 * <p>Java class for representation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="representation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stylesheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multipart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "representation", propOrder = {
    "mediaType",
    "stylesheet",
    "template",
    "schema",
    "meta",
    "multipart"
})
@XmlRootElement(name = "representation")
public class RepresentationDefinition
    implements Serializable
{

    /**
     * Тип содержимого
     * 
     */
    @XmlElement(required = true)
    protected String mediaType;
    /**
     * Шаблон трансформации
     * 
     */
    protected String stylesheet;
    /**
     * Шаблон файла (например для ods)
     * 
     */
    protected String template;
    /**
     * schema URL
     * 
     */
    protected String schema;
    /**
     * meta URL
     * 
     */
    protected String meta;
    /**
     * Is representation in multiple files
     * 
     */
    protected String multipart;

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
     * Gets the value of the stylesheet property.
     * <p>
     * Шаблон трансформации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStylesheet() {
        return stylesheet;
    }

    /**
     * Sets the value of the stylesheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStylesheet()
     */
    public void setStylesheet(String value) {
        this.stylesheet = value;
    }

    /**
     * Gets the value of the template property.
     * <p>
     * Шаблон файла (например для ods)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTemplate()
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the schema property.
     * <p>
     * schema URL
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchema()
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the meta property.
     * <p>
     * meta URL
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeta()
     */
    public void setMeta(String value) {
        this.meta = value;
    }

    /**
     * Gets the value of the multipart property.
     * <p>
     * Is representation in multiple files
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipart() {
        return multipart;
    }

    /**
     * Sets the value of the multipart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMultipart()
     */
    public void setMultipart(String value) {
        this.multipart = value;
    }

    public RepresentationDefinition withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    public RepresentationDefinition withStylesheet(String value) {
        setStylesheet(value);
        return this;
    }

    public RepresentationDefinition withTemplate(String value) {
        setTemplate(value);
        return this;
    }

    public RepresentationDefinition withSchema(String value) {
        setSchema(value);
        return this;
    }

    public RepresentationDefinition withMeta(String value) {
        setMeta(value);
        return this;
    }

    public RepresentationDefinition withMultipart(String value) {
        setMultipart(value);
        return this;
    }

}
