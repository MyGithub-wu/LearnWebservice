package wxj.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWs {
	@WebMethod
	public String sayHello(String name);

}
