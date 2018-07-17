package wxj.ws.Data;



import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import wxj.ws.model.Student;

@WebService
public interface DataWs {

	@WebMethod
	public boolean addStudent(Student student);
	@WebMethod
	public List<Student> getStudent();
	@WebMethod
	public Student getStudentbyId(int id);
	@WebMethod
	public Map<Integer, Student> getAllstudent();
	
	
}

