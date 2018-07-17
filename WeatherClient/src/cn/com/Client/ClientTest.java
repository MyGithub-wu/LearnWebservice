package cn.com.Client;
import java.util.ArrayList;
import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherWS weatherws=new WeatherWS();
		WeatherWSSoap weather=weatherws.getWeatherWSSoap();
		ArrayOfString weatherlist=weather.getWeather("±±¾©", " ");
		List<String> list =weatherlist.getString();
		System.out.println(list);
	}

}
