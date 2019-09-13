
package efact.sgs.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transactionResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transactionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdrFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="digestValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdfFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlSigned" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionResult", propOrder = {
    "cdrFile",
    "digestValue",
    "identifier",
    "message",
    "outString",
    "pdfFile",
    "status",
    "xmlSigned"
})
public class TransactionResult {

    protected byte[] cdrFile;
    protected String digestValue;
    protected String identifier;
    protected String message;
    protected String outString;
    protected byte[] pdfFile;
    protected String status;
    protected byte[] xmlSigned;

    /**
     * Obtiene el valor de la propiedad cdrFile.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCdrFile() {
        return cdrFile;
    }

    /**
     * Define el valor de la propiedad cdrFile.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCdrFile(byte[] value) {
        this.cdrFile = value;
    }

    /**
     * Obtiene el valor de la propiedad digestValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestValue() {
        return digestValue;
    }

    /**
     * Define el valor de la propiedad digestValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestValue(String value) {
        this.digestValue = value;
    }

    /**
     * Obtiene el valor de la propiedad identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Define el valor de la propiedad identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad outString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutString() {
        return outString;
    }

    /**
     * Define el valor de la propiedad outString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutString(String value) {
        this.outString = value;
    }

    /**
     * Obtiene el valor de la propiedad pdfFile.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdfFile() {
        return pdfFile;
    }

    /**
     * Define el valor de la propiedad pdfFile.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdfFile(byte[] value) {
        this.pdfFile = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlSigned.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXmlSigned() {
        return xmlSigned;
    }

    /**
     * Define el valor de la propiedad xmlSigned.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXmlSigned(byte[] value) {
        this.xmlSigned = value;
    }

}
