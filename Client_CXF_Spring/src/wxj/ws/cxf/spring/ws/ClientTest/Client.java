package wxj.ws.cxf.spring.ws.ClientTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import wxj.ws.cxf.spring.ws.OrderWs;
import wxj.ws.cxf.spring.ws.Order;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���client�������ļ�
       ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(new String[]{"client_beans.xml"});
       //���OrderWs�ӿ� ����
       OrderWs orderws =(OrderWs) context.getBean("orderClient");
       Order order1=orderws.getOrderbyId(134);
       System.out.println(order1);
	}

}
