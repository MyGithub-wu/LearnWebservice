package wxj.ws.client;

import wxj.ws.HelloWsImple;
import wxj.ws.HelloWsImpleService;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWsImpleService factory =new HelloWsImpleService();
		HelloWsImple helloWs=factory.getHelloWsImplePort();
		String name=helloWs.sayHello("jack");
		System.out.println("client:"+name);
	}

}
