
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idconta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idconta",
    "quantia",
    "senha"
})
@XmlRootElement(name = "sacar")
public class Sacar {

    protected int idconta;
    protected double quantia;
    @XmlElement(required = true)
    protected String senha;

    /**
     * Obtém o valor da propriedade idconta.
     * 
     */
    public int getIdconta() {
        return idconta;
    }

    /**
     * Define o valor da propriedade idconta.
     * 
     */
    public void setIdconta(int value) {
        this.idconta = value;
    }

    /**
     * Obtém o valor da propriedade quantia.
     * 
     */
    public double getQuantia() {
        return quantia;
    }

    /**
     * Define o valor da propriedade quantia.
     * 
     */
    public void setQuantia(double value) {
        this.quantia = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
