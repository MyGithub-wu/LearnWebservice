package wxj.ws.client;

import wxj.ws.HelloWsImple;
import wxj.ws.HelloWsImpleService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HelloWsImpleService factory=new HelloWsImpleService();
         HelloWsImple hello=factory.getHelloWsImplePort();
         String he=hello.sayHello("bob");
         System.out.println(he);
	}

}
