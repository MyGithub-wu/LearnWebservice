package wxj.ws.interceptor;

import java.util.List;

import javax.xml.bind.annotation.DomHandler;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.velocity.runtime.directive.Parse;
import org.apache.xml.utils.DOMHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;





public class AddUserInterceptor extends AbstractPhaseInterceptor<SoapMessage>{

	private String name;
	private String password;
	//������ʲôʱ��ᱻ���ص�������
	public AddUserInterceptor(String name,String password) {
		super(Phase.PRE_PROTOCOL);  //׼��Э�黯ʱ���أ�ȷ����������ʱ��
		this.name=name;
		this.password=password;
		
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		List<Header> header=msg.getHeaders();
		//DomHandler<ElementT, Result>
		
	/**
	 *   <head>
	 *      <name>wuxiaojing</name>
	 *      <password>123456</password>
	 *   </head>
	 */
	Document document= DOMHelper.createDocument();
	Element rooteEle = document.createElement("head");
	Element  nameEle =document.createElement("name");
	nameEle.setTextContent(name);
	rooteEle.appendChild(nameEle);
	Element  passwordEle =document.createElement("password");
	passwordEle.setTextContent(password);
	rooteEle.appendChild(passwordEle);
	//���һ���µ�header
	header.add(new Header(new QName("head"), rooteEle));
	System.out.println("client handleMessage()");
	}

	
}
