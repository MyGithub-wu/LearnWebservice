package wxj.ws.client;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import wxj.ws.data.DataWs;
import wxj.ws.data.DataWsImpleService;
import wxj.ws.data.Student;

import java.util.List;
import org.apache.cxf.endpoint.Client;
public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DataWsImpleService factory=new DataWsImpleService();
        DataWs dataws= factory.getDataWsImplePort();
       /* System.out.println("ok1");
        //添加请求的客户端对象
        Client client= ClientProxy.getClient(dataws);
        //添加输出拦截器
        System.out.println("ok1");
        List<Interceptor<? extends Message>> OutInterceptors =client.getOutInterceptors();
        OutInterceptors.add(new LoggingOutInterceptor());
        System.out.println("ok1");
        //添加输入拦截器
        List<Interceptor<? extends Message>> InInterceptors =client.getInInterceptors();
        InInterceptors.add(new LoggingInInterceptor());
        */
//        System.out.println("ok2");
        dataws.getStudentbyId(1);
        System.out.println("succeed");
        
        }

}
