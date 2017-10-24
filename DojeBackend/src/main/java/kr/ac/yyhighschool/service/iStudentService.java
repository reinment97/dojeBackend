package kr.ac.yyhighschool.service;

import java.util.List;
import java.util.Map;

import kr.ac.yyhighschool.model.Student;

public interface iStudentService {
	public List<Map<String, Object>> getStudentsList();
	public List<Student> getStudents();
}
