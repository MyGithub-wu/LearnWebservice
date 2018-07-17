package wxj.ws.client;

import wxj.ws.data.DataWs;
import wxj.ws.data.DataWsImpleService;
import wxj.ws.data.Student;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DataWsImpleService factory=new DataWsImpleService();
        DataWs client= factory.getDataWsImplePort();
        client.addStudent(new Student(1,"liming",234));
        
        }

}
