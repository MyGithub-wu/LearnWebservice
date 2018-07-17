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
        //获取拦截器
        List<Interceptor<? extends Message>> InInterceptors= endpointimple.getInInterceptors();
        //添加入拦截器
        InInterceptors.add(new LoggingInInterceptor());
        
        //添加出拦截器
        List<Interceptor<? extends Message>> OutInterceptors= endpointimple.getOutInterceptors();
        OutInterceptors.add(new LoggingOutInterceptor());*/
        System.out.println(endpoint);
        System.out.println("Server2发布成功");

	}
}
