package cn.wxj.flight;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.Service;

import org.apache.axis.message.MessageElement;

import cn.com.WebXml.DomesticAirlineLocator;
import cn.com.WebXml.DomesticAirlineSoapStub;
import cn.com.WebXml.GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult;
import cn.com.WebXml.GetDomesticCityResponseGetDomesticCityResult;
import cn.com.WebXml.WeatherWebServiceLocator;
import cn.com.WebXml.WeatherWebServiceSoap;
import cn.com.WebXml.WeatherWebServiceSoapStub;

public class Client {
	   public static void main(String[] args) throws ServiceException,RemoteException {
	       // WeatherWebServiceLocator locator = new WeatherWebServiceLocator();
	       // WeatherWebServiceSoapStub service = (WeatherWebServiceSoapStub) locator.getPort(WeatherWebServiceSoapStub.class);
	       // invokeGetSupportProvince(service);
	        System.out.println("...................");
	       // invokeGetSupportCity(service);
	       //  invokeGetWeatherByOneCity(service);
	        DomesticAirlineLocator locator1 = new DomesticAirlineLocator();
	        DomesticAirlineSoapStub service1 = (DomesticAirlineSoapStub) locator1.getPort(DomesticAirlineSoapStub.class);
	        invokeGetSupportFlight(service1);
	        //invokeGetSupportFlightCity(service1);
	   }
	   public static void invokeGetSupportFlightCity(
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
       }
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
	           GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult flighttime = service.getDomesticAirlinesTime("北京", "上海", "2018-07-07"," ");
	           StringBuffer str = new StringBuffer(""); 
	           GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult schema;
			  // MessageElement[] messageElements = (MessageElement)flighttime;
	           /*StringBuffer str1 = new StringBuffer("");  
	            for (MessageElement m : messageElements) {  
	                str.append(m.toString());  
	            }  */
	          // Object messageElements;
			/*for (GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult ss:flighttime) {  
	               // str.append(ss.toString());  
	            }  */
	         //  MessageElement[] messageElements= flighttime.getSerializer("String", json, "xml");
	         //  JSONObject xmlJSONObj = flighttime.toJSONObject(flighttime);
	           //  System.out.println(messageElements.toString());
	        //  messageElements.
	          /* for (MessageElement m : messageElements) {  
	                //str.append(m.toString()); 
	        	 //  String[] time=
	        	   System.out.println(m);  
	            }  */
	          // System.out.println(time);  
	         // System.out.println(flight);
}
	   
}
		
		
      

	
	