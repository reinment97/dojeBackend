package kr.ac.yyhighschool.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.yyhighschool.dao.iStudentDao;
import kr.ac.yyhighschool.model.Student;
import kr.ac.yyhighschool.service.iStudentService;

@Service("studentService")
public class StudentServiceImpl implements iStudentService {

	@Resource(name="studentDao")
	private iStudentDao studentDao;

	@Override
	public List<Map<String, Object>> getStudentsList() {
		// TODO Auto-generated method stub
		//return null;
		return studentDao.getStudentList();
	}
	
	@Override
	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

}