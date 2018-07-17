package wxj.ws.client;

import java.util.List;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import wxj.ws.HelloWsImple;
import wxj.ws.HelloWsImpleService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HelloWsImpleService factory=new HelloWsImpleService();
         HelloWsImple hello=factory.getHelloWsImplePort();
         
         org.apache.cxf.endpoint.Client client=  ClientProxy.getClient(hello);
         //ÃÌº” ‰≥ˆ¿πΩÿ∆˜
        
         List<Interceptor<? extends Message>> OutInterceptors =client.getOutInterceptors();
         OutInterceptors.add(new LoggingOutInterceptor());
         
         //ÃÌº” ‰»Î¿πΩÿ∆˜
         List<Interceptor<? extends Message>> InInterceptors =client.getInInterceptors();
         InInterceptors.add(new LoggingInInterceptor());
         
         String he=hello.sayHello("bob");
         System.out.println(he);
	}

}
