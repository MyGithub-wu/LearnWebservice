package cn.wxj.flight;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.Service;

import org.apache.axis.message.MessageElement;

import cn.com.WebXml.DomesticAirlineLocator;
import cn.com.WebXml.DomesticAirlineSoapStub;
import cn.com.WebXml.GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult;
import cn.com.WebXml.GetDomesticCityResponseGetDomesticCityResult;

public class Client {
	   public static void main(String[] args) throws ServiceException,RemoteException {
	        System.out.println("...................");
	        DomesticAirlineLocator locator = new DomesticAirlineLocator();
	        DomesticAirlineSoapStub service = (DomesticAirlineSoapStub) locator1.getPort(DomesticAirlineSoapStub.class);
	        invokeGetSupportFlight(service);
	        //invokeGetSupportFlightCity(service1);
	   }
	  /* public static void invokeGetSupportFlightCity(
	           WeatherWebServiceSoapStub service) throws RemoteException {
               String[] provices = service.getSupportProvince();
	           System.out.println("总共" + provices.length + "个");
	            int count = 0;
	            for (String str : provices) {
	                if (0 != count && count % 5 == 0) {
	                    System.out.println();
	                }
	                System.out.print(str + "\t");
	                count++;
	            }
       }*/
	   public static void invokeGetSupportFlightCity(
			   DomesticAirlineSoapStub service) throws RemoteException {
	           GetDomesticCityResponseGetDomesticCityResult flighttime = service.getDomesticCity();
	           StringBuffer str = new StringBuffer(""); 
	           MessageElement[] messageElements= flighttime.get_any();
	           for (MessageElement m : messageElements) {  
	                str.append(m.toString());  
	            }  
	           System.out.println(str);  
	           System.out.println("----------------------");
}
	 /*  public static void invokeGetSupportProvince(
			   DomesticAirlineSoapStub service) throws RemoteException {
		               GetDomesticCityResponseGetDomesticCityResult provices = service.getDomesticCity();
			           System.out.println("总共" + provices.length + "个");
			            int count = 0;
			            for (String str : provices) {
			                if (0 != count && count % 5 == 0) {
			                    System.out.println();
			                }
			                System.out.print(str + "\t");
			                count++;
			            }
	   }*/
	   public static void invokeGetSupportFlight(
			   DomesticAirlineSoapStub service) throws RemoteException {
	           GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult flighttime = service.getDomesticAirlinesTime("北京", "上海", "2018-07-10"," ");
	           StringBuffer str = new StringBuffer(""); 
	           MessageElement[] messageElements= flighttime.get_any();
	           messageElements.
	           Element root = messageElements.getRootElement();  

	              String ss= messageElements[1].getAttribute("StartDrome");
	              System.out.println(ss+"  succeed");
	           for (MessageElement m : messageElements) { 
	        	   //String city=m.getLocalName();
	                str.append(m.toString()); 
	        	  //  String xx=m.getAttribute("ArriveTime");
	        	    //  System.out.println(xx+"ok");
			   // System.out.println(m.getAttributeValue(""));
	            } 
	          // JSON json=JSON.stringify(str);
	          System.out.println(str+"ok");  
	           System.out.println("----------------------");
}
}
	   

		
		
      

	
	