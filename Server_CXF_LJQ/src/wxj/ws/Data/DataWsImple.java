package wxj.ws.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import wxj.ws.model.Student;

@WebService
public class DataWsImple implements DataWs {

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Server add student " +student);
		return true;
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentbyId(int id) {
		// TODO Auto-generated method stub
		System.out.println("server getstudentbyid " +id);
		return new Student(1,"cat",1234);
	}

	@Override
	public Map<Integer, Student> getAllstudent() {
		// TODO Auto-generated method stub
		System.out.println("server getallstudent");
		Map<Integer,Student> map=new HashMap<>();
		Student s1=new Student(1,"tom",123);
		Student s2=new Student(2,"mary",321);
		Student s3=new Student(3,"kate",213);
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		return map;
		
		
	}

}
