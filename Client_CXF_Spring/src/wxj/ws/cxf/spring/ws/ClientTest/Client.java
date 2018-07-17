package wxj.ws.cxf.spring.ws.ClientTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import wxj.ws.cxf.spring.ws.OrderWs;
import wxj.ws.cxf.spring.ws.Order;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获得client的配置文件
       ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(new String[]{"client_beans.xml"});
       //获得OrderWs接口 对象
       OrderWs orderws =(OrderWs) context.getBean("orderClient");
       Order order1=orderws.getOrderbyId(134);
       System.out.println(order1);
	}

}
