package cn.com.phonetest;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class Phonetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileCodeWS mobliews=new MobileCodeWS();
		MobileCodeWSSoap phone=mobliews.getMobileCodeWSSoap();
		String phonepp=phone.getMobileCodeInfo("15931172553", " ");
		System.out.println(phonepp);
		
	}

}
