package wxj.ws;

import javax.jws.WebService;

@WebService
public class HelloWsImple implements HelloWs {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("server say hello"+name);
		return "Hello"+name;
	}

}
