package wxj.ws.server;



import java.util.List;

import org.apache.cxf.message.Message;
import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;

import wxj.ws.HelloWsImple;
import wxj.ws.Data.DataWsImple;

public class Server2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="http://10.28.190.164:8080/Server_CXF/dataws";
        Endpoint endpoint = Endpoint.publish(address, new DataWsImple());
        /*EndpointImpl endpointimple = (EndpointImpl)endpoint;
        //��ȡ������
        List<Interceptor<? extends Message>> InInterceptors= endpointimple.getInInterceptors();
        //�����������
        InInterceptors.add(new LoggingInInterceptor());
        
        //��ӳ�������
        List<Interceptor<? extends Message>> OutInterceptors= endpointimple.getOutInterceptors();
        OutInterceptors.add(new LoggingOutInterceptor());*/
        System.out.println(endpoint);
        System.out.println("Server2�����ɹ�");

	}
}
