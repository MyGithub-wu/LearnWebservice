package wxj.ws.data;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-07-14T10:00:52.373+08:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "DataWsImpleService",
                  wsdlLocation = "http://10.8.211.204:8089/Server_CXF/dataws?wsdl",
                  targetNamespace = "http://Data.ws.wxj/")
public class DataWsImpleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Data.ws.wxj/", "DataWsImpleService");
    public final static QName DataWsImplePort = new QName("http://Data.ws.wxj/", "DataWsImplePort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.8.211.204:8089/Server_CXF/dataws?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DataWsImpleService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.8.211.204:8089/Server_CXF/dataws?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DataWsImpleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DataWsImpleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DataWsImpleService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DataWsImpleService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DataWsImpleService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DataWsImpleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DataWs
     */
    @WebEndpoint(name = "DataWsImplePort")
    public DataWs getDataWsImplePort() {
        return super.getPort(DataWsImplePort, DataWs.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataWs
     */
    @WebEndpoint(name = "DataWsImplePort")
    public DataWs getDataWsImplePort(WebServiceFeature... features) {
        return super.getPort(DataWsImplePort, DataWs.class, features);
    }

}