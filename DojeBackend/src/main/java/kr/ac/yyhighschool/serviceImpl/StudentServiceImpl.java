package kr.ac.yyhighschool.serviceImpl;

import java.util.HashMap;
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
	@Override
	public Map<String, Object> saveStudentInfo(Map<String, String> reqParam) {
		// TODO Auto-generated method stub
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			studentDao.saveStudentInfo(reqParam);
			result.put("code", "00");
			result.put("message", "SUCCESS");
			
		}catch(Exception e){
			result.put("code", "01");
			result.put("message", "unknown error");
		}
		
		return result;
	}

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
	
	@Override
	public Student getStudentInfo(String id) {
		return studentDao.getStudentInfo(id);
	}

}