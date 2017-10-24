package kr.ac.yyhighschool.dao;

import java.util.Map;
import java.util.List;

import kr.ac.yyhighschool.model.Student;

public interface iStudentDao {
	public List<Map<String, Object>> getStudentList();
	public List<Student> getStudents();
}
