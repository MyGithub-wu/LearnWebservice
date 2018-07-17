package wxj.ws.server;

import javax.xml.ws.Endpoint;

import wxj.ws.HelloWsImple;
import wxj.ws.Data.DataWsImple;

public class Server2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="http://10.8.211.204:8089/Server_CXF/dataws";
        Endpoint.publish(address, new DataWsImple());
        System.out.println("Server2发布成功");
	}

}
