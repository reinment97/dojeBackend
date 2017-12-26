package co.kr.doje.daoImpl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kr.doje.VO.UserVO;
import co.kr.doje.dao.UserDao;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public UserVO getLogin(Map<String, String> reqParam) {
		return sqlSession.selectOne("getLogin",reqParam);
	}

	@Override
	public int insertUser(Map<String, String> reqParam) {
		return sqlSession.insert("insertUser", reqParam);
	}

}
