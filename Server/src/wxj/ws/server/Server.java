package wxj.ws.server;

import javax.xml.ws.Endpoint;

import wxj.ws.HelloWsImple;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String address="http://192.168.1.109:8989/Server/hellows";
         Endpoint.publish(address, new HelloWsImple());
         System.out.println("Server发布成功");
	}

}
