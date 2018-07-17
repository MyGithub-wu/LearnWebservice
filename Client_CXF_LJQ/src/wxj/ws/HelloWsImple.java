package wxj.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-07-13T17:55:11.785+08:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://ws.wxj/", name = "HelloWsImple")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWsImple {

    @WebMethod
    @Action(input = "http://ws.wxj/HelloWsImple/sayHelloRequest", output = "http://ws.wxj/HelloWsImple/sayHelloResponse")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ws.wxj/", className = "wxj.ws.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ws.wxj/", className = "wxj.ws.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
