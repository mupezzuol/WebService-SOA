
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicoConta", targetNamespace = "http://ws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicoConta {


    /**
     * 
     * @param idConta
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "consultarDadosContaReturn", targetNamespace = "http://ws")
    @RequestWrapper(localName = "consultarDadosConta", targetNamespace = "http://ws", className = "ws.ConsultarDadosConta")
    @ResponseWrapper(localName = "consultarDadosContaResponse", targetNamespace = "http://ws", className = "ws.ConsultarDadosContaResponse")
    public List<String> consultarDadosConta(
        @WebParam(name = "idConta", targetNamespace = "http://ws")
        int idConta);

}
