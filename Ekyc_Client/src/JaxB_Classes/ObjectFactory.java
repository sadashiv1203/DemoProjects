//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 07:18:03 PM IST 
//


package JaxB_Classes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the JaxB_Classes package. 
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

    private final static QName _Auth_QNAME = new QName("http://www.demo.com/Ekyc_Auth/1.0", "Auth");
    
    private final static QName _Auth_QNAME2 = new QName("http://www.demo.com/Ekyc_Auth/2.1", "Auth");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: JaxB_Classes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }
    
    public Auth createAuth2() {
        return new Auth();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link SkeyType }
     * 
     */
    public SkeyType createSkeyType() {
        return new SkeyType();
    }

    /**
     * Create an instance of {@link Tkn }
     * 
     */
    public Tkn createTkn() {
        return new Tkn();
    }

    /**
     * Create an instance of {@link Uses }
     * 
     */
    public Uses createUses() {
        return new Uses();
    }

    /**
     * Create an instance of {@link Meta }
     * 
     */
    public Meta createMeta() {
        return new Meta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
   
    @XmlElementDecl(namespace = "http://www.demo.com/Ekyc_Auth/2.0", name = "Auth")
    public JAXBElement<Auth> createAuth(Auth value) {
        return new JAXBElement<Auth>(_Auth_QNAME, Auth.class, null, value);
    }
    
    @XmlElementDecl(namespace = "http://www.demo.com/Ekyc_Auth/2.1", name = "Auth")
       public JAXBElement<Auth> createAuth2(Auth value) {
        return new JAXBElement<Auth>(_Auth_QNAME2, Auth.class, null, value);
    }

}
