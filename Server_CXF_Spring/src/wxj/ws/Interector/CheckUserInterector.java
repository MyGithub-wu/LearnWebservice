package wxj.ws.Interector;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;



public class CheckUserInterector extends AbstractPhaseInterceptor<SoapMessage> {

	public CheckUserInterector() {
		super(Phase.PRE_PROTOCOL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		Header header=msg.getHeader(new QName("head"));
		Element head=(Element) header.getObject();
		String name=head.getElementsByTagName("name").item(0).getTextContent();
		String password =head.getElementsByTagName("password").item(0).getTextContent();
		if("wuxiaojing".equals(name) && "123456".equals(password)) {
			System.out.println("Server 通过拦截器");
			return;
	     }
		System.out.println("Server 没有通过拦截器");
		throw new Fault(new RuntimeException("请输入一个正确的用户名和密码"));
		
		
	}

}
