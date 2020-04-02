
package com.ighing.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ighing.service package. 
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

    private final static QName _CrearCliente_QNAME = new QName("http://service.ighing.com/", "crearCliente");
    private final static QName _CrearClienteResponse_QNAME = new QName("http://service.ighing.com/", "crearClienteResponse");
    private final static QName _ConsultarCliente_QNAME = new QName("http://service.ighing.com/", "consultarCliente");
    private final static QName _ConsultarClienteResponse_QNAME = new QName("http://service.ighing.com/", "consultarClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ighing.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearClienteResponse }
     * 
     */
    public CrearClienteResponse createCrearClienteResponse() {
        return new CrearClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarCliente }
     * 
     */
    public ConsultarCliente createConsultarCliente() {
        return new ConsultarCliente();
    }

    /**
     * Create an instance of {@link ConsultarClienteResponse }
     * 
     */
    public ConsultarClienteResponse createConsultarClienteResponse() {
        return new ConsultarClienteResponse();
    }

    /**
     * Create an instance of {@link CrearCliente }
     * 
     */
    public CrearCliente createCrearCliente() {
        return new CrearCliente();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ighing.com/", name = "crearCliente")
    public JAXBElement<CrearCliente> createCrearCliente(CrearCliente value) {
        return new JAXBElement<CrearCliente>(_CrearCliente_QNAME, CrearCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ighing.com/", name = "crearClienteResponse")
    public JAXBElement<CrearClienteResponse> createCrearClienteResponse(CrearClienteResponse value) {
        return new JAXBElement<CrearClienteResponse>(_CrearClienteResponse_QNAME, CrearClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ighing.com/", name = "consultarCliente")
    public JAXBElement<ConsultarCliente> createConsultarCliente(ConsultarCliente value) {
        return new JAXBElement<ConsultarCliente>(_ConsultarCliente_QNAME, ConsultarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ighing.com/", name = "consultarClienteResponse")
    public JAXBElement<ConsultarClienteResponse> createConsultarClienteResponse(ConsultarClienteResponse value) {
        return new JAXBElement<ConsultarClienteResponse>(_ConsultarClienteResponse_QNAME, ConsultarClienteResponse.class, null, value);
    }

}
