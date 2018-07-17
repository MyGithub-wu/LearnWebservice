
package wxj.ws.cxf.spring.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wxj.ws.cxf.spring.ws package. 
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

    private final static QName _GetOrderbyId_QNAME = new QName("http://ws.spring.cxf.ws.wxj/", "getOrderbyId");
    private final static QName _GetOrderbyIdResponse_QNAME = new QName("http://ws.spring.cxf.ws.wxj/", "getOrderbyIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wxj.ws.cxf.spring.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderbyId }
     * 
     */
    public GetOrderbyId createGetOrderbyId() {
        return new GetOrderbyId();
    }

    /**
     * Create an instance of {@link GetOrderbyIdResponse }
     * 
     */
    public GetOrderbyIdResponse createGetOrderbyIdResponse() {
        return new GetOrderbyIdResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderbyId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.spring.cxf.ws.wxj/", name = "getOrderbyId")
    public JAXBElement<GetOrderbyId> createGetOrderbyId(GetOrderbyId value) {
        return new JAXBElement<GetOrderbyId>(_GetOrderbyId_QNAME, GetOrderbyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderbyIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.spring.cxf.ws.wxj/", name = "getOrderbyIdResponse")
    public JAXBElement<GetOrderbyIdResponse> createGetOrderbyIdResponse(GetOrderbyIdResponse value) {
        return new JAXBElement<GetOrderbyIdResponse>(_GetOrderbyIdResponse_QNAME, GetOrderbyIdResponse.class, null, value);
    }

}
