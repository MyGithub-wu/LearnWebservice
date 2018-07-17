package wxj.ws.client;

import java.util.List;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import wxj.ws.HelloWsImple;
import wxj.ws.HelloWsImpleService;
import wxj.ws.interceptor.AddUserInterceptor;

import org.apache.cxf.endpoint.Client;

public class Client3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HelloWsImpleService factory=new HelloWsImpleService();
         HelloWsImple hello=factory.getHelloWsImplePort();
         
         Client client=  ClientProxy.getClient(hello);
         //Ìí¼ÓÊä³öÀ¹½ØÆ÷
        
        List<Interceptor<? extends Message>> OutInterceptors =client.getOutInterceptors();
         OutInterceptors.add(new AddUserInterceptor("wuxiaojing", "123457"));
         
         String result=hello.sayHello(" liming");
         System.out.println("client"+result);
	}

}
