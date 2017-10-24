package kr.ac.yyhighschool.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.yyhighschool.dao.iStudentDao;
import kr.ac.yyhighschool.model.Student;

@Repository("studentDao")
public class StudentDaoImpl implements iStudentDao {

	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Map<String, Object>> getStudentList() {
		return sqlSession.selectList("getStudentList");
	}
	
	@Override
	public List<Student> getStudents() {
		return sqlSession.selectList("getStudentList");
	}

}
