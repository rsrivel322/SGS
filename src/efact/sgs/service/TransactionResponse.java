
package efact.sgs.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transactionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transactionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdrFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="digestValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdfFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sunatError" type="{http://service.sgs.efact/}sunatError" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "transactionResponse", propOrder = {
    "cdrFile",
    "digestValue",
    "identifier",
    "outString",
    "pdfFile",
    "responseCode",
    "sunatError",
    "uuid",
    "xmlSigned"
})
public class TransactionResponse {

    protected byte[] cdrFile;
    protected String digestValue;
    protected String identifier;
    protected String outString;
    protected byte[] pdfFile;
    protected int responseCode;
    protected SunatError sunatError;
    protected String uuid;
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
     * Obtiene el valor de la propiedad responseCode.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Define el valor de la propiedad responseCode.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sunatError.
     * 
     * @return
     *     possible object is
     *     {@link SunatError }
     *     
     */
    public SunatError getSunatError() {
        return sunatError;
    }

    /**
     * Define el valor de la propiedad sunatError.
     * 
     * @param value
     *     allowed object is
     *     {@link SunatError }
     *     
     */
    public void setSunatError(SunatError value) {
        this.sunatError = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
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
