package cn.com.Client;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import cn.com.webxml.DomesticAirline;
import cn.com.webxml.DomesticAirlineSoap;
import cn.com.webxml.GetDomesticAirlinesTimeResponse.GetDomesticAirlinesTimeResult;
public class ClientTest {

	private static final char[] ss = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomesticAirline factory=new DomesticAirline();
		DomesticAirlineSoap air=factory.getDomesticAirlineSoap();
		GetDomesticAirlinesTimeResult res= air.getDomesticAirlinesTime("北京", "上海", "2018-07-17", " ");
		Object flight=res.getAny();
		ArrayList<ElementNSImpl> oo=(ArrayList<ElementNSImpl>)flight;
		NodeList airtime = oo.get(1).getElementsByTagName("AirlinesTime");
		int len=airtime.getLength();
		System.out.println(len+"len");
		System.out.println("长度"+len);
		//该方法简洁
		for(int i=0;i<len;i++)
		{
			NodeList child=airtime.item(i).getChildNodes();
			for(int j=0;j<child.getLength();j++) {
				Node node=child.item(j).getFirstChild();
				String s=node.getTextContent().toString();
				//Node AirlineCode=child.item(j).getFirstChild();
				System.out.print(s +"    ");
			}
			System.out.println(" ");
			
		}
		
		
		/*//该方法过于繁琐
		NodeList company = oo.get(1).getElementsByTagName("Company");
		NodeList arilinecode=oo.get(1).getElementsByTagName("AirlineCode");
		NodeList start=oo.get(1).getElementsByTagName("StartDrome");
		NodeList arrive=oo.get(1).getElementsByTagName("ArriveDrome");
		for(int i=0;i<len ;i++){
		  Node no1= company.item(i).getFirstChild();
		  Node no2=arilinecode.item(i).getFirstChild();
		  Node no3=start.item(i).getFirstChild();
		  Node no4=arrive.item(i).getFirstChild();
		  //company.toString();
		  String s1=no1.getTextContent().toString();
		  String s2=no2.getTextContent().toString();
		  String s3=no3.getTextContent().toString();
		  String s4=no4.getTextContent().toString();
		   System.out.println(s1+"    "+s2+"  "+s3+"   "+s4);
		}*/

		}
	    
	}



