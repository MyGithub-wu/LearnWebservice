package wxj.ws.cxf.spring.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import wxj.ws.cxf.spring.bean.Order;

@WebService
public interface OrderWs {
   @WebMethod
	public Order getOrderbyId(int id);
}
