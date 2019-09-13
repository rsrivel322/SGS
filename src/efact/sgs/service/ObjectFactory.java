
package efact.sgs.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the efact.sgs.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Authorization_QNAME = new QName("http://service.sgs.efact/", "Authorization");
    private final static QName _ExecutionException_QNAME = new QName("http://service.sgs.efact/", "ExecutionException");
    private final static QName _InterruptedException_QNAME = new QName("http://service.sgs.efact/", "InterruptedException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: efact.sgs.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link ExecutionException }
     * 
     */
    public ExecutionException createExecutionException() {
        return new ExecutionException();
    }

    /**
     * Create an instance of {@link InterruptedException }
     * 
     */
    public InterruptedException createInterruptedException() {
        return new InterruptedException();
    }

    /**
     * Create an instance of {@link TransactionResponse }
     * 
     */
    public TransactionResponse createTransactionResponse() {
        return new TransactionResponse();
    }

    /**
     * Create an instance of {@link TransactionResult }
     * 
     */
    public TransactionResult createTransactionResult() {
        return new TransactionResult();
    }

    /**
     * Create an instance of {@link SunatError }
     * 
     */
    public SunatError createSunatError() {
        return new SunatError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authorization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sgs.efact/", name = "Authorization")
    public JAXBElement<Authorization> createAuthorization(Authorization value) {
        return new JAXBElement<Authorization>(_Authorization_QNAME, Authorization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sgs.efact/", name = "ExecutionException")
    public JAXBElement<ExecutionException> createExecutionException(ExecutionException value) {
        return new JAXBElement<ExecutionException>(_ExecutionException_QNAME, ExecutionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterruptedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sgs.efact/", name = "InterruptedException")
    public JAXBElement<InterruptedException> createInterruptedException(InterruptedException value) {
        return new JAXBElement<InterruptedException>(_InterruptedException_QNAME, InterruptedException.class, null, value);
    }

}
