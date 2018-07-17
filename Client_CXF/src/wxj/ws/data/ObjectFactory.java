
package wxj.ws.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wxj.ws.data package. 
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

    private final static QName _AddStudent_QNAME = new QName("http://Data.ws.wxj/", "addStudent");
    private final static QName _AddStudentResponse_QNAME = new QName("http://Data.ws.wxj/", "addStudentResponse");
    private final static QName _GetAllstudent_QNAME = new QName("http://Data.ws.wxj/", "getAllstudent");
    private final static QName _GetAllstudentResponse_QNAME = new QName("http://Data.ws.wxj/", "getAllstudentResponse");
    private final static QName _GetStudent_QNAME = new QName("http://Data.ws.wxj/", "getStudent");
    private final static QName _GetStudentResponse_QNAME = new QName("http://Data.ws.wxj/", "getStudentResponse");
    private final static QName _GetStudentbyId_QNAME = new QName("http://Data.ws.wxj/", "getStudentbyId");
    private final static QName _GetStudentbyIdResponse_QNAME = new QName("http://Data.ws.wxj/", "getStudentbyIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wxj.ws.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllstudentResponse }
     * 
     */
    public GetAllstudentResponse createGetAllstudentResponse() {
        return new GetAllstudentResponse();
    }

    /**
     * Create an instance of {@link GetAllstudentResponse.Return }
     * 
     */
    public GetAllstudentResponse.Return createGetAllstudentResponseReturn() {
        return new GetAllstudentResponse.Return();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link GetAllstudent }
     * 
     */
    public GetAllstudent createGetAllstudent() {
        return new GetAllstudent();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link GetStudentbyId }
     * 
     */
    public GetStudentbyId createGetStudentbyId() {
        return new GetStudentbyId();
    }

    /**
     * Create an instance of {@link GetStudentbyIdResponse }
     * 
     */
    public GetStudentbyIdResponse createGetStudentbyIdResponse() {
        return new GetStudentbyIdResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetAllstudentResponse.Return.Entry }
     * 
     */
    public GetAllstudentResponse.Return.Entry createGetAllstudentResponseReturnEntry() {
        return new GetAllstudentResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ws.wxj/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ws.wxj/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllstudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ws.wxj/", name = "getAllstudent")
    public JAXBElement<GetAllstudent> createGetAllstudent(GetAllstudent value) {
        return new JAXBElement<GetAllstudent>(_GetAllstudent_QNAME, GetAllstudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllstudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ws.wxj/", name = "getAllstudentResponse")
    public JAXBElement<GetAllstudentResponse> createGetAllstudentResponse(GetAllstudentResponse value) {
        return new JAXBElement<GetAllstudentResponse>(_GetAllstudentResponse_QNAME, GetAllstudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ws.wxj/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<GetStudent>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ws.wxj/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<GetStudentResponse>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentbyId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ws.wxj/", name = "getStudentbyId")
    public JAXBElement<GetStudentbyId> createGetStudentbyId(GetStudentbyId value) {
        return new JAXBElement<GetStudentbyId>(_GetStudentbyId_QNAME, GetStudentbyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentbyIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Data.ws.wxj/", name = "getStudentbyIdResponse")
    public JAXBElement<GetStudentbyIdResponse> createGetStudentbyIdResponse(GetStudentbyIdResponse value) {
        return new JAXBElement<GetStudentbyIdResponse>(_GetStudentbyIdResponse_QNAME, GetStudentbyIdResponse.class, null, value);
    }

}
