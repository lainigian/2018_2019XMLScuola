//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.01.29 alle 07:47:10 PM CET 
//


package scuola;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classe" type="{}tipoClasse" maxOccurs="unbounded" minOccurs="0"/>
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
    "classe"
})
@XmlRootElement(name = "scuola")
public class Scuola {

    protected List<TipoClasse> classe;

    public Scuola()
    {
    	classe= new ArrayList<TipoClasse>();
    }
    
    public void addClasse(TipoClasse classe)
    {
    	this.classe.add(classe);
    }

    public void addClasse(int posizione, TipoClasse classe)
    {
    	this.classe.add(posizione, classe);
    }
    
    public TipoClasse getSingolaClasse(int posizione)
    {
    	return classe.get(posizione);
    }
    
    public void removeClasse(int posizione)
    {
    	classe.remove(posizione);
    }
    
    public int getNumeroElementi()
    {
    	return classe.size();
    }
    
    public String toString()
    {
    	return classe.toString();
    }
    /**
     * Gets the value of the classe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoClasse }
     * 
     * 
     */
    public List<TipoClasse> getClasse() {
        if (classe == null) {
            classe = new ArrayList<TipoClasse>();
        }
        return this.classe;
    }

}
