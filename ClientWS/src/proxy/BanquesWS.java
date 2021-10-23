
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BanquesWS", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8686/BanqueWS?wsdl")
public class BanquesWS
    extends Service
{

    private final static URL BANQUESWS_WSDL_LOCATION;
    private final static WebServiceException BANQUESWS_EXCEPTION;
    private final static QName BANQUESWS_QNAME = new QName("http://ws/", "BanquesWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8686/BanqueWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUESWS_WSDL_LOCATION = url;
        BANQUESWS_EXCEPTION = e;
    }

    public BanquesWS() {
        super(__getWsdlLocation(), BANQUESWS_QNAME);
    }

    public BanquesWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUESWS_QNAME, features);
    }

    public BanquesWS(URL wsdlLocation) {
        super(wsdlLocation, BANQUESWS_QNAME);
    }

    public BanquesWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUESWS_QNAME, features);
    }

    public BanquesWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanquesWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUESWS_EXCEPTION!= null) {
            throw BANQUESWS_EXCEPTION;
        }
        return BANQUESWS_WSDL_LOCATION;
    }

}
