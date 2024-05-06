
package ma.amarghad.proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.amarghad.proxy package. 
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

    private static final QName _GetAccount_QNAME = new QName("http://service.bankws.amarghad.ma/", "getAccount");
    private static final QName _GetAccountResponse_QNAME = new QName("http://service.bankws.amarghad.ma/", "getAccountResponse");
    private static final QName _GetAccounts_QNAME = new QName("http://service.bankws.amarghad.ma/", "getAccounts");
    private static final QName _GetAccountsResponse_QNAME = new QName("http://service.bankws.amarghad.ma/", "getAccountsResponse");
    private static final QName _ToMAD_QNAME = new QName("http://service.bankws.amarghad.ma/", "toMAD");
    private static final QName _ToMADResponse_QNAME = new QName("http://service.bankws.amarghad.ma/", "toMADResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.amarghad.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     * @return
     *     the new instance of {@link GetAccounts }
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountsResponse }
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link ToMAD }
     * 
     * @return
     *     the new instance of {@link ToMAD }
     */
    public ToMAD createToMAD() {
        return new ToMAD();
    }

    /**
     * Create an instance of {@link ToMADResponse }
     * 
     * @return
     *     the new instance of {@link ToMADResponse }
     */
    public ToMADResponse createToMADResponse() {
        return new ToMADResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.bankws.amarghad.ma/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.bankws.amarghad.ma/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.bankws.amarghad.ma/", name = "getAccounts")
    public JAXBElement<GetAccounts> createGetAccounts(GetAccounts value) {
        return new JAXBElement<>(_GetAccounts_QNAME, GetAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.bankws.amarghad.ma/", name = "getAccountsResponse")
    public JAXBElement<GetAccountsResponse> createGetAccountsResponse(GetAccountsResponse value) {
        return new JAXBElement<>(_GetAccountsResponse_QNAME, GetAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToMAD }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToMAD }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.bankws.amarghad.ma/", name = "toMAD")
    public JAXBElement<ToMAD> createToMAD(ToMAD value) {
        return new JAXBElement<>(_ToMAD_QNAME, ToMAD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToMADResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToMADResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.bankws.amarghad.ma/", name = "toMADResponse")
    public JAXBElement<ToMADResponse> createToMADResponse(ToMADResponse value) {
        return new JAXBElement<>(_ToMADResponse_QNAME, ToMADResponse.class, null, value);
    }

}
