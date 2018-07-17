package wxj.ws.cxf.spring.ws;

import javax.jws.WebService;

import wxj.ws.cxf.spring.bean.Order;

@WebService
public class OrderImple implements OrderWs {

	@Override
	public Order getOrderbyId(int id) {
	     System.out.println("servet getOrderId");
	     return new Order(1, 21, 1234);
   
	}

}
