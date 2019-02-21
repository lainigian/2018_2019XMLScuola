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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoClasse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoClasse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anno">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sezione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="studente" type="{}tipoStudente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoClasse", propOrder = {
    "anno",
    "sezione",
    "corso",
    "studente"
})
public class TipoClasse {

    protected int anno;
    @XmlElement(required = true)
    protected String sezione;
    @XmlElement(required = true)
    protected String corso;
    protected List<TipoStudente> studente;

    public TipoClasse()
    {
    	studente=new ArrayList<TipoStudente>();
    }
    
    public TipoClasse(int anno, String sezione, String corso)
    {
    	setAnno(anno);
    	setSezione(sezione);
    	setCorso(corso);
    	studente=new ArrayList<TipoStudente>();
    }
    
    public TipoStudente getSingoloStudente(int posizione)
    {
    	return studente.get(posizione);
    }
    
    public void addStudente(int posizione, TipoStudente studente)
    {
    	this.studente.add(posizione, studente);
    }
    
    public void addStudente(TipoStudente studente)
    {
    	this.studente.add(studente);
    }
    
    public void removeStudente(int posizione)
    {
    	studente.remove(posizione);
    }
    
    public int getNumeroElementi()
    {
    	return studente.size();
    }
    
    public String toString()
    {
    	return "[classe: "+getAnno()+getSezione()+getCorso()+ studente.toString();
    }
    /**
     * Recupera il valore della proprietà anno.
     * 
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Imposta il valore della proprietà anno.
     * 
     */
    public void setAnno(int value) {
        this.anno = value;
    }

    /**
     * Recupera il valore della proprietà sezione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSezione() {
        return sezione;
    }

    /**
     * Imposta il valore della proprietà sezione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSezione(String value) {
        this.sezione = value;
    }

    /**
     * Recupera il valore della proprietà corso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorso() {
        return corso;
    }

    /**
     * Imposta il valore della proprietà corso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorso(String value) {
        this.corso = value;
    }

    /**
     * Gets the value of the studente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoStudente }
     * 
     * 
     */
    public List<TipoStudente> getStudente() {
        if (studente == null) {
            studente = new ArrayList<TipoStudente>();
        }
        return this.studente;
    }

}
