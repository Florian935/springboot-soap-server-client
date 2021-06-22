//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.06.20 à 11:48:36 PM CEST 
//


package localhost._8080;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._8080 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._8080
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFactureRequest }
     * 
     */
    public GetFactureRequest createGetFactureRequest() {
        return new GetFactureRequest();
    }

    /**
     * Create an instance of {@link GetFactureResponse }
     * 
     */
    public GetFactureResponse createGetFactureResponse() {
        return new GetFactureResponse();
    }

    /**
     * Create an instance of {@link Facture }
     * 
     */
    public Facture createFacture() {
        return new Facture();
    }

    /**
     * Create an instance of {@link GetFacturesRequest }
     * 
     */
    public GetFacturesRequest createGetFacturesRequest() {
        return new GetFacturesRequest();
    }

    /**
     * Create an instance of {@link GetFacturesResponse }
     * 
     */
    public GetFacturesResponse createGetFacturesResponse() {
        return new GetFacturesResponse();
    }

    /**
     * Create an instance of {@link AddFactureRequest }
     * 
     */
    public AddFactureRequest createAddFactureRequest() {
        return new AddFactureRequest();
    }

    /**
     * Create an instance of {@link AddFactureResponse }
     * 
     */
    public AddFactureResponse createAddFactureResponse() {
        return new AddFactureResponse();
    }

}
